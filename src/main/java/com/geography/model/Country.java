package com.geography.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Country {
	
	@Id
	private String countryName;
	
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<State> state;
}
