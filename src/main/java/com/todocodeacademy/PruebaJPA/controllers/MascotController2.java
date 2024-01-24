package com.todocodeacademy.PruebaJPA.controllers;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import com.todocodeacademy.PruebaJPA.models.MascotModel2;
import com.todocodeacademy.PruebaJPA.services.MascotService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascots2")
public class MascotController2 {

    @Autowired
    private MascotService2 mascotService2;

    @GetMapping
    public List<MascotModel2> getMascots(){
        return mascotService2.getMascots();
    }

    @GetMapping("/{id_mascot}")
    public MascotModel2 findMascotById(@PathVariable Long id_mascot){
        MascotModel2 mascotMod = mascotService2.findMascot(id_mascot);
        return mascotMod;
    }

    @PostMapping("/create")
    public MascotModel2 saveMascot(@RequestBody MascotModel2 mascotModel){
        MascotModel2 saveM = mascotService2.saveMascot(mascotModel);
        return saveM;
    }

    @PutMapping("/edit/{id_mascot}")
    public MascotModel2 editMascot(@PathVariable Long id_mascot, @RequestBody MascotModel2 mascotModel){

        MascotModel2 mascotEd = mascotService2.editMascot(id_mascot, mascotModel);
        return mascotEd;
    }

    @DeleteMapping("/delete/{id_mascot}")
    public String deleteMascot(@PathVariable Long id_mascot){
        try {
            mascotService2.deleteMascot(id_mascot);
            return "Mascot deleted successfully";
        }catch (Exception e){
            return "Error";
        }
    }

}
