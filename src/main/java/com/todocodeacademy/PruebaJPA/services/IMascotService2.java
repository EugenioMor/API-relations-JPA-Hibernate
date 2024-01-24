package com.todocodeacademy.PruebaJPA.services;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import com.todocodeacademy.PruebaJPA.models.MascotModel2;

import java.util.List;

public interface IMascotService2 {

    public List<MascotModel2> getMascots();

    public MascotModel2 findMascot(Long id);

    public MascotModel2 saveMascot(MascotModel2 mascotModel);

    public void deleteMascot(Long mascot_id);

    public MascotModel2 editMascot(Long id, MascotModel2 mascotModel);
}
