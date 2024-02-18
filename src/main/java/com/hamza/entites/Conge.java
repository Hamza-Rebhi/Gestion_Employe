package com.hamza.entites;

import java.util.Date;

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
public class Conge extends BaseEntitie{
@Column(nullable = false,unique = true)
private String raison;
@Column(nullable = false)
private Date debut,fin;
@Column(nullable = false)
private String type;
@Column(nullable = false)
private String explication;
@ManyToOne
@JsonIgnoreProperties("conges")
private Employe employe;
}
