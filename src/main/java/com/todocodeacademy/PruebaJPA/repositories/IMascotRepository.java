package com.todocodeacademy.PruebaJPA.repositories;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotRepository extends JpaRepository<MascotModel, Long> {
}
