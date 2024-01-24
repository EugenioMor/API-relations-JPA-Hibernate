package com.todocodeacademy.PruebaJPA.repositories;

import com.todocodeacademy.PruebaJPA.models.PersonModel2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository2 extends JpaRepository<PersonModel2, Long> {
}
