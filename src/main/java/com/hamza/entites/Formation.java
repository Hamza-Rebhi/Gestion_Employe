package com.hamza.entites;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation extends BaseEntitie {
	@Column(nullable = false,unique = true)
	private String titre;
	private String lieu;
	private Date debut;
	private Double duree;
	@ManyToMany
	@JsonIgnoreProperties("formations")
	private List<Employe> employes;

}
