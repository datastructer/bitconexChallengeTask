package de.allianz.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
	
	@JsonProperty("temp")
	private  Long temp;
	
	@JsonProperty("feels_like")
	private  Long feelsLike;
	
	@JsonProperty("temp_min")
	private  Long tempMin;
	
	@JsonProperty("temp_max")
	private  Long tempMax;
	
	@JsonProperty("pressure")
	private  Long pressure;
	
	@JsonProperty("humidty")
	private  Long humidty;

	public Long getTemp() {
		return temp;
	}

	public void setTemp(Long temp) {
		this.temp = temp;
	}

	public Long getFeelsLike() {
		return feelsLike;
	}

	public void setFeelsLike(Long feelsLike) {
		this.feelsLike = feelsLike;
	}

	public Long getTempMin() {
		return tempMin;
	}

	public void setTempMin(Long tempMin) {
		this.tempMin = tempMin;
	}

	public Long getTempMax() {
		return tempMax;
	}

	public void setTempMax(Long tempMax) {
		this.tempMax = tempMax;
	}

	public Long getPressure() {
		return pressure;
	}

	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}

	public Long getHumidty() {
		return humidty;
	}

	public void setHumidty(Long humidty) {
		this.humidty = humidty;
	} 
	
	
	

}
