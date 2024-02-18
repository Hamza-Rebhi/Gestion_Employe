package com.hamza.contollers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamza.entites.dto.EmployeDTO;
import com.hamza.services.EmployeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeController {
	private final EmployeService employeService;
@GetMapping("/findAll")
public List<EmployeDTO> findALlEmploye(){
	return employeService.findAllEmploye();
}
@GetMapping("/findbynomorprenom/{nom}/{prenom}")
public List<EmployeDTO> findEmployeByNomOrPrenom(@PathVariable String nom ,@PathVariable String prenom){
	return employeService.findByNomOrPrenom(nom, prenom);
}
@GetMapping("/findbymail/{mail}")
public EmployeDTO findEmployeByMail(@PathVariable String mail) {
	return employeService.findByEmail(mail);
}
@PostMapping("/addemploye")
public EmployeDTO addEmploye(@RequestBody EmployeDTO employeDTO) {
	return employeService.createEmploye(employeDTO);
}

}
