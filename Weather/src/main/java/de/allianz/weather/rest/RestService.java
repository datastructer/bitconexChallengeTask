package de.allianz.weather.rest;


import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.allianz.weather.model.WeatherRequestModel;



@RestController
@Validated
@RequestMapping("/api")
public class RestService {
	
	private final WeatherService weatherService;
	
	public RestService(WeatherService weatherService) {
	 this.weatherService = weatherService;
	}	
	@RequestMapping(value = "/getWeather", method = RequestMethod.POST,produces="application/json")
	public String getWeatherData(@Valid @RequestBody  WeatherRequestModel requestModel ) {
		
		JSONObject weather = new JSONObject(); 
		weather = weatherService.getWeatherData(requestModel.getCityName());			
		return weather.toString();
	}    
}
