package com.hamza.entites.dto;

import java.util.Date;
import java.util.List;

import com.hamza.entites.Employe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormationDTO {
	private String titre;
	private String lieu;
	private Date debut;
	private Double duree;
	private List<Employe> employes;

}
