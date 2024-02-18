package com.hamza.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.hamza.entites.Profile;
import com.hamza.entites.dto.ProfileDTO;

@Mapper
public interface ProfileMapper {
	ProfileMapper INSTANCE=Mappers.getMapper(ProfileMapper.class);
	Profile mapProfileDTOToProfile(ProfileDTO profileDTO);
	ProfileDTO mapProfileToProfileDTO(Profile profile);


}
