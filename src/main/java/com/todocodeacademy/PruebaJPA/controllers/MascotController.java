package com.todocodeacademy.PruebaJPA.controllers;

import com.todocodeacademy.PruebaJPA.models.MascotModel;
import com.todocodeacademy.PruebaJPA.services.MascotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascots")
public class MascotController {

    @Autowired
    private MascotService mascotService;

    @GetMapping
    public List<MascotModel> getMascots(){
        return mascotService.getMascots();
    }

    @GetMapping("/{id_mascot}")
    public MascotModel findMascotById(@PathVariable Long id_mascot){
        MascotModel mascotMod = mascotService.findMascot(id_mascot);
        return mascotMod;
    }

    @PostMapping("/create")
    public MascotModel saveMascot(@RequestBody MascotModel mascotModel){
        MascotModel saveM = mascotService.saveMascot(mascotModel);
        return saveM;
    }

    @PutMapping("/edit/{id_mascot}")
    public MascotModel editMascot(@PathVariable Long id_mascot, @RequestBody MascotModel mascotModel){

        MascotModel mascotEd = mascotService.editMascot(id_mascot, mascotModel);
        return mascotEd;
    }

    @DeleteMapping("/delete/{id_mascot}")
    public String deleteMascot(@PathVariable Long id_mascot){
        try {
            mascotService.deleteMascot(id_mascot);
            return "Mascot deleted successfully";
        }catch (Exception e){
            return "Error";
        }
    }
}
