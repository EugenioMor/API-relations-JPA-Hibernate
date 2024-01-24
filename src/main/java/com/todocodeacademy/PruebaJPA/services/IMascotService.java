package com.todocodeacademy.PruebaJPA.services;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import com.todocodeacademy.PruebaJPA.models.PersonModel;

import java.util.List;

public interface IMascotService {

    public List<MascotModel> getMascots();

    public MascotModel findMascot(Long id);

    public MascotModel saveMascot(MascotModel mascotModel);

    public void deleteMascot(Long mascot_id);

    public MascotModel editMascot(Long id, MascotModel mascotModel);
}
