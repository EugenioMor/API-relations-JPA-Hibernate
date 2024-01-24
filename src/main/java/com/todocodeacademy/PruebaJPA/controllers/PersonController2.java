package com.todocodeacademy.PruebaJPA.controllers;

import com.todocodeacademy.PruebaJPA.models.PersonModel;
import com.todocodeacademy.PruebaJPA.models.PersonModel2;
import com.todocodeacademy.PruebaJPA.services.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons2")
public class PersonController2 {

    @Autowired
    private PersonService2 personService2;

    @GetMapping
    public List<PersonModel2> getPersons(){
        return personService2.getPersons();
    }

    @GetMapping("/{id}")
    public PersonModel2 findPersonById(@PathVariable Long id){
        PersonModel2 personMod = personService2.findPerson(id);
        return personMod;
    }

    @PostMapping("/create")
    public PersonModel2 savePerson(@RequestBody PersonModel2 personModel){
        PersonModel2 saveP = personService2.savePerson(personModel);
        return saveP;
    }

    @PutMapping("/edit/{id}")
    public PersonModel2 editPerson(@PathVariable Long id, @RequestBody PersonModel2 personModel){

        PersonModel2 personEd = personService2.editPerson(id, personModel);
        return personEd;
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id){
        try {
            personService2.deletePerson(id);
            return "Person deleted successfully";
        }catch (Exception e){
            return "Error";
        }
    }

    @PutMapping("/edit")
    public PersonModel2 editPerson(@RequestBody PersonModel2 person){
        personService2.editPerson(person);

        return personService2.findPerson(person.getId());
    }
}
