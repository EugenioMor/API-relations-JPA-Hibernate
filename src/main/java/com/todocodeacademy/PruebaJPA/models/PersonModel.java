package com.todocodeacademy.PruebaJPA.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String lastname;
    private int age;
    @OneToOne
    @JoinColumn(name = "one_mascot_id_mascot", referencedColumnName = "id_mascot")
    private MascotModel oneMascot;

}
