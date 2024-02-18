package com.hamza.services;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hamza.entites.Employe;
import com.hamza.entites.dto.EmployeDTO;
import com.hamza.mappers.EmployeMapper;
import com.hamza.repositories.EmployeRepositorie;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EmployeServiceImp implements EmployeService {
	private final EmployeRepositorie employeRepositorie;

	

	@Override
	public EmployeDTO createEmploye(EmployeDTO employeDTO) {
		
		return EmployeMapper.INSTANCE.mapEmployeToEmployeDTO( employeRepositorie.save(EmployeMapper.INSTANCE.mapEmployeDTOToEmploye(employeDTO)));
	}

	@Override
	public Optional<EmployeDTO> findEmployeById(Integer id) {
		Optional<Employe> employe= employeRepositorie.findById(id);
		if(employe.isPresent()) {
			return Optional.of(EmployeMapper.INSTANCE.mapEmployeToEmployeDTO(employe.get()));
		}
		else {
		return Optional.empty();}
	}

	@Override
	public List<EmployeDTO> findAllEmploye() {
		List<Employe> employes=employeRepositorie.findAll();
		return employes
				.stream()
				.map(employe->EmployeMapper.INSTANCE.mapEmployeToEmployeDTO(employe)).collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		employeRepositorie.deleteById(id);

	}

	@Override
	public EmployeDTO updateEmploye(EmployeDTO employeDTO) {
		
		return EmployeMapper.INSTANCE.mapEmployeToEmployeDTO(employeRepositorie.save(EmployeMapper.INSTANCE.mapEmployeDTOToEmploye(employeDTO)));
	}

	@Override
	public List<EmployeDTO> findByNomOrPrenom(String nom, String prenom) {
		List<Employe> employes=employeRepositorie.findByNomOrPrenom(nom, prenom);
		return employes
				.stream()
				.map(employe->EmployeMapper.INSTANCE.mapEmployeToEmployeDTO(employe))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeDTO findByEmail(String email) {
		Employe employe=employeRepositorie.findByEmail(email);
		return EmployeMapper.INSTANCE.mapEmployeToEmployeDTO(employe);
	}

	@Override
	public List<EmployeDTO> trierEmployeNom() {
		List<Employe> employes=employeRepositorie.trierEmployeNom();
		return employes.stream().map(employe->EmployeMapper.INSTANCE.mapEmployeToEmployeDTO(employe)).collect(Collectors.toList());
	}

}
