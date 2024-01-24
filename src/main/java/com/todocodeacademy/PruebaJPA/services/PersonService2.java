package com.todocodeacademy.PruebaJPA.services;

import com.todocodeacademy.PruebaJPA.models.PersonModel;
import com.todocodeacademy.PruebaJPA.models.PersonModel2;
import com.todocodeacademy.PruebaJPA.repositories.IPersonRepository;
import com.todocodeacademy.PruebaJPA.repositories.IPersonRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService2 implements IPersonService2{

    @Autowired
    private IPersonRepository2 personRepository2;
    @Override
    public List<PersonModel2> getPersons() {
        List<PersonModel2> listPersons = personRepository2.findAll();
        return listPersons;
    }

    @Override
    public PersonModel2 findPerson(Long id) {
        PersonModel2 findPerson = personRepository2.findById(id).orElse(null);
        return findPerson;
    }

    @Override
    public PersonModel2 savePerson(PersonModel2 personModel) {
        PersonModel2 personMod = personRepository2.save(personModel);
        return personMod;
    }

    @Override
    public void deletePerson(Long id) {
        personRepository2.deleteById(id);
    }

    @Override
    public PersonModel2 editPerson(Long id, PersonModel2 personModel) {
        PersonModel2 editPerson = this.findPerson(id);

        editPerson.setName(personModel.getName());
        editPerson.setLastname(personModel.getLastname());
        editPerson.setAge(personModel.getAge());

        return savePerson(editPerson);
    }

    @Override
    public void editPerson(PersonModel2 person) {
        this.savePerson(person);
    }
}
