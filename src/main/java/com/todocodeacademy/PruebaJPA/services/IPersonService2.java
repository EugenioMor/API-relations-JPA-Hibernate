package com.todocodeacademy.PruebaJPA.services;

import com.todocodeacademy.PruebaJPA.models.PersonModel2;

import java.util.List;

public interface IPersonService2 {

    public List<PersonModel2> getPersons();

    public PersonModel2 findPerson(Long id);

    public PersonModel2 savePerson(PersonModel2 personModel);

    public void deletePerson(Long id);

    public PersonModel2 editPerson(Long id, PersonModel2 personModel);

    public void editPerson(PersonModel2 person);
}
