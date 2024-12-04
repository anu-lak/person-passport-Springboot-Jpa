package com.Person_Passport.person_passport.service;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.Person_Passport.person_passport.model.Passport;
import com.Person_Passport.person_passport.model.Person;

public class PersonCreation {
    
    public static List<Person> createAListOfPersons(){
        

        Passport ps1 = new Passport("ASM101", Date.from(Instant.now()),"Kerala");
        Person p1 = new Person("anu", Date.from(Instant.now()), "Kerala", ps1);

        Passport ps2 = new Passport("ASM102", Date.from(Instant.now()),"Kerala");
        Person p2 = new Person("chrisin", Date.from(Instant.now()), "Kerala", ps2);

        Passport ps3 = new Passport("ASM103", Date.from(Instant.now()),"Kerala");
        Person p3 = new Person("aswin", Date.from(Instant.now()), "Kerala", ps3);

        Passport ps4 = new Passport("ASM104", Date.from(Instant.now()),"Kerala");
        Person p4 = new Person("joel", Date.from(Instant.now()), "Kerala", ps4);

        Passport ps5 = new Passport("ASM105", Date.from(Instant.now()),"Kerala");
        Person p5 = new Person("mani", Date.from(Instant.now()), "Kerala", ps5);

        List<Person> newPersons = new ArrayList<>();
        newPersons.add(p1);
        newPersons.add(p2);
        newPersons.add(p3);
        newPersons.add(p4);
        newPersons.add(p5);


        return newPersons;
    }
}
