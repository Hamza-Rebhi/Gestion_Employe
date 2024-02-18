package com.hamza.entites;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class  BaseEntitie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

}
