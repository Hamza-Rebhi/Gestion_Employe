package com.hamza.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hamza.entites.Employe;

public interface EmployeRepositorie extends JpaRepository<Employe, Integer> {
	List<Employe> findByNomOrPrenom(String nom , String prenom);
	Employe findByEmail(String email);
	@Query("select e from Employe e order by e.nom ASC")
	 List<Employe> trierEmployeNom();
	

}
