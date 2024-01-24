package com.todocodeacademy.PruebaJPA.services;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import com.todocodeacademy.PruebaJPA.models.MascotModel2;
import com.todocodeacademy.PruebaJPA.repositories.IMascotRepository;
import com.todocodeacademy.PruebaJPA.repositories.IMascotRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotService2 implements IMascotService2{

    @Autowired
    private IMascotRepository2 mascotRepository2;

    @Override
    public List<MascotModel2> getMascots() {
        List<MascotModel2> listMascots = mascotRepository2.findAll();
        return listMascots;
    }

    @Override
    public MascotModel2 findMascot(Long id) {
        MascotModel2 findMascot = mascotRepository2.findById(id).orElse(null);
        return findMascot;
    }

    @Override
    public MascotModel2 saveMascot(MascotModel2 mascotModel) {
        return mascotRepository2.save(mascotModel);
    }

    @Override
    public void deleteMascot(Long mascot_id) {
        mascotRepository2.deleteById(mascot_id);
    }

    @Override
    public MascotModel2 editMascot(Long id, MascotModel2 mascotModel) {
        MascotModel2 mascot = this.findMascot(id);

        mascot.setName(mascotModel.getName());
        mascot.setSpecies(mascotModel.getSpecies());
        mascot.setBreed(mascotModel.getBreed());
        mascot.setColor(mascotModel.getColor());

        return saveMascot(mascot);
    }
}
