package de.allianz.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {
	
	@JsonProperty("speed")
	private Long speed;
	
	@JsonProperty("deg")
	private Long deg;

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}

	public Long getDeg() {
		return deg;
	}

	public void setDeg(Long deg) {
		this.deg = deg;
	}
	
	

}
