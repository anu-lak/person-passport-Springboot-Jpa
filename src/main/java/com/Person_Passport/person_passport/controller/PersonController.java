package com.Person_Passport.person_passport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Person_Passport.person_passport.model.Person;
import com.Person_Passport.person_passport.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    //post 5 persons with their passports
    @PostMapping
    public void addPerson(){
        personService.addPerson();
    }

    //get person using passport id, if not found , raise 404;
    @GetMapping("/passport/{passportId}")
    public ResponseEntity<?> getPersonWithPassortId(@PathVariable String passportId){
        Person person = personService.getPersonWithPassportId(passportId);
        if(person != null){
            return ResponseEntity.ok(person);
        }else{
            return ResponseEntity.notFound().build();
        }
        
    }

    @GetMapping
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }    
}
