package com.Person_Passport.person_passport.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Person_Passport.person_passport.model.Passport;

@Repository
public interface PassportRepo extends JpaRepository<Passport,Long>{

    Optional<Passport> findByPassportId(String passportId);
    
}
