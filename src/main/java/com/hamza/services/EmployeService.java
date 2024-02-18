package com.hamza.services;

import java.util.List;
import java.util.Optional;

import com.hamza.entites.dto.EmployeDTO;



public interface EmployeService {
	EmployeDTO createEmploye(EmployeDTO employeDTO);
	Optional<EmployeDTO> findEmployeById(Integer id);
	List<EmployeDTO>findAllEmploye();
	void deleteById(Integer id);
	EmployeDTO updateEmploye(EmployeDTO employeDTO);
	List<EmployeDTO> findByNomOrPrenom(String nom , String prenom);
	EmployeDTO findByEmail(String email);
	List<EmployeDTO> trierEmployeNom();
}
