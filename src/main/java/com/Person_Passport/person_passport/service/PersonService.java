package com.Person_Passport.person_passport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Person_Passport.person_passport.model.Passport;
import com.Person_Passport.person_passport.model.Person;
import com.Person_Passport.person_passport.repository.PassportRepo;
import com.Person_Passport.person_passport.repository.PersonRepo;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private PassportRepo passportRepo;

    public void addPerson() {
       List<Person> personList = PersonCreation.createAListOfPersons();
        personRepo.saveAll(personList);

    }

    public Person getPersonWithPassportId(String passportId) {
        Optional<Passport> passportOptional = passportRepo.findByPassportId(passportId);
        if(!passportOptional.isPresent()){
            return null;
        }else{
            Passport passport = passportOptional.get();
            Person person = personRepo.findByPassport(passport);
            return person;
        }
            

    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
    
}
