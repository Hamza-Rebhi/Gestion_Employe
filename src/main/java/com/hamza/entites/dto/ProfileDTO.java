package com.hamza.entites.dto;
import com.hamza.entites.Employe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {
	private String photo,telephone;
    private String adresse;
    private Employe employe;
}
