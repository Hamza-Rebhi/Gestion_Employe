package com.hamza.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.hamza.entites.Conge;
import com.hamza.entites.dto.CongeDTO;

@Mapper
public interface CongeMapper {
	CongeMapper INSTANCE =Mappers.getMapper(CongeMapper.class);
	Conge mapCongeDTOToConge(CongeDTO congeDTO);
	CongeDTO mapCongeToCongeDTO(Conge conge);

}
