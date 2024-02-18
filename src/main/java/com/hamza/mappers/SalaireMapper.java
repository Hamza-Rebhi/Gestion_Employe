package com.hamza.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.hamza.entites.Salaire;
import com.hamza.entites.dto.SalaireDTO;

@Mapper
public interface SalaireMapper {
	SalaireMapper INSTANCE=Mappers.getMapper(SalaireMapper.class);
	SalaireDTO mapSalaireToSalaireDTO(Salaire salaire);
	Salaire mapSalaireDTOToSalaire(SalaireDTO salaireDTO);



}
