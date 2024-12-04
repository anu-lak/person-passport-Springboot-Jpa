package com.Person_Passport.person_passport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Person_Passport.person_passport.model.Passport;
import com.Person_Passport.person_passport.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long>{

    Person findByPassport(Passport passport);
    
}
