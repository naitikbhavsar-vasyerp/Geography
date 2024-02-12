package com.geography.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class City {

	@Id
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name = "stateName")
	private State state;
}
