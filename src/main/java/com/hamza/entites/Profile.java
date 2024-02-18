package com.hamza.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile extends BaseEntitie {
	private String photo,telephone;
    private String adresse;
    @OneToOne
    @JsonIgnoreProperties("profile")
    @JoinColumn(name="id")
    private Employe employe;
}
