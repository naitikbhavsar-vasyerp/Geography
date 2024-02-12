package com.geography.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class State {

	@Id
	private String stateName;
	
	@ManyToOne
	@JoinColumn(name = "countryName")
	private Country country;
	
	@OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<City> city;
}
