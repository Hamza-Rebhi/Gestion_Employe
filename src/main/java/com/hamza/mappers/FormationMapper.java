package com.hamza.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.hamza.entites.Formation;
import com.hamza.entites.dto.FormationDTO;

@Mapper
public interface FormationMapper {
	FormationMapper INSTANCE=Mappers.getMapper(FormationMapper.class);
	Formation mapFormationDTOToFormation(FormationDTO formationDTO);
	FormationDTO mapFormationToFormationDTO(Formation formation);

}
