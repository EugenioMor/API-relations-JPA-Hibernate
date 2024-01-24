package com.todocodeacademy.PruebaJPA.services;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import com.todocodeacademy.PruebaJPA.repositories.IMascotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotService implements IMascotService{

    @Autowired
    private IMascotRepository mascotRepository;

    @Override
    public List<MascotModel> getMascots() {
        List<MascotModel> listMascots = mascotRepository.findAll();
        return listMascots;
    }

    @Override
    public MascotModel findMascot(Long id) {
        MascotModel findMascot = mascotRepository.findById(id).orElse(null);
        return findMascot;
    }

    @Override
    public MascotModel saveMascot(MascotModel mascotModel) {
        return mascotRepository.save(mascotModel);
    }

    @Override
    public void deleteMascot(Long mascot_id) {
        mascotRepository.deleteById(mascot_id);
    }

    @Override
    public MascotModel editMascot(Long id_mascot, MascotModel mascotModel) {
        MascotModel mascot = this.findMascot(id_mascot);

        mascot.setName(mascotModel.getName());
        mascot.setSpecies(mascotModel.getSpecies());
        mascot.setBreed(mascotModel.getBreed());
        mascot.setColor(mascotModel.getColor());

        return saveMascot(mascot);
    }
}
