package com.hamza.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.hamza.entites.Employe;
import com.hamza.entites.dto.EmployeDTO;

@Mapper
public interface EmployeMapper {
	EmployeMapper INSTANCE=Mappers.getMapper(EmployeMapper.class);
	EmployeDTO mapEmployeToEmployeDTO(Employe employe);
	Employe mapEmployeDTOToEmploye(EmployeDTO employeDTO);

}
