package com.geography.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geography.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{

}
