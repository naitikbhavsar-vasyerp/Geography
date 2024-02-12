package com.geography.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.geography.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, String>{
	@Query(value = "SELECT state_name FROM state WHERE country_name = :countryName", nativeQuery = true)
	List<String> findByCountryName(@Param("countryName") String countryName);
}
