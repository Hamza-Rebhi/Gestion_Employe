package com.hamza.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salaire extends BaseEntitie {
	@Column(nullable = false,unique = true)
	private String base;
	@Column(nullable = false)
	private Double prixSup;
	@Column(nullable = false)
	private Integer heuresSup;
	@Column(nullable = false)
	private Integer mois;
	@ManyToOne
	@JsonIgnoreProperties("salaire")
	private Employe employe;

}
