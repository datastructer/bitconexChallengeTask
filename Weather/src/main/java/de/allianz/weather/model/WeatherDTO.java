package de.allianz.weather.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDTO  implements Serializable{

	private static final long serialVersionUID = -2836640908868479726L;
	
	@JsonProperty("name")
	private String condition;
	
	@JsonProperty("weather")
	private List<Weather> weather;
	
	@JsonProperty("main")
	private Main   main;
	
	@JsonProperty("wind")
	private Wind wind;

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	
	
	
}
