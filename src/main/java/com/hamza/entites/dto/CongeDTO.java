package com.hamza.entites.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CongeDTO {
	private String raison;
	private Date debut,fin;
	private String type;
	private String explication;
	private EmployeDTO employe;
}
