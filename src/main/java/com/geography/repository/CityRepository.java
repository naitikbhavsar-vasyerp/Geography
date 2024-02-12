package com.geography.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.geography.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, String>{
	@Query(value = "SELECT city_name FROM city WHERE state_name = :stateName", nativeQuery = true)
	List<String> findByStateName(@Param("stateName") String stateName);
}
