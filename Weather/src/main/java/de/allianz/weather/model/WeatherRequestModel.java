package de.allianz.weather.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherRequestModel implements Serializable{

	private static final long serialVersionUID = 1885968563525054780L;
	
	
	@NotNull(message = "Please provide a city name")
	@JsonProperty("cityName")
	private String cityName;


	public String getCityName() {
		return cityName;
	}
	

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	

}
