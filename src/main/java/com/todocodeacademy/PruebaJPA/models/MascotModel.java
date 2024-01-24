package com.todocodeacademy.PruebaJPA.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MascotModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascot;
    private String name;
    private String species;
    private String breed;
    private String color;
}
