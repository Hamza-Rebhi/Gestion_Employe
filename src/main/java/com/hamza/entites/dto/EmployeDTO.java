package com.hamza.entites.dto;
import java.util.List;
import com.hamza.entites.Conge;
import com.hamza.entites.Formation;
import com.hamza.entites.Profile;
import com.hamza.entites.Salaire;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDTO {
	private String nom;
	private String prenom;
	@Email
	private String email;
	private String password;
	private String grade;
	private Profile profile;
	private List<Salaire> salaires;
	private List<Conge> conges;
	private List<Formation>formations;
}
