package com.hamza.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe extends BaseEntitie {
	@Column(nullable = false,unique = true)
	private String nom,prenom,email,password;
	private String grade;
	@OneToOne(mappedBy="employe")
	@JsonIgnore
	private Profile profile;
	@OneToMany(mappedBy="employe")
	@JsonIgnoreProperties("employe")
	private List<Salaire> salaires;
	@OneToMany(mappedBy = "employe")
	@JsonIgnoreProperties("employe")
	private List<Conge> conges;
	@ManyToMany
	@JsonIgnoreProperties("employes")
	private List<Formation>formations;
	

}
