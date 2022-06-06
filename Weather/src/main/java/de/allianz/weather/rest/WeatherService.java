package de.allianz.weather.rest;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.allianz.weather.model.WeatherDTO;

@Service
public class WeatherService {
		
	public JSONObject getWeatherData(String cityName) {
		RestTemplate restTemplate = new RestTemplate();	
		JSONObject jsonObj = new JSONObject();
		Map<String, String> params = new HashMap<>();
		params.put("city name", cityName);
		params.put("API key", "c7ca3aa7935acf93d30fb3959c8c3ed0");	
		params.put("units", "metric");
		WeatherDTO weather = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}&units={units}", 
			    WeatherDTO.class, params);		
		jsonObj.put("conditions",weather.getWeather().get(0).getDescription());
		jsonObj.put("temperature", weather.getMain().getTemp());
		jsonObj.put("wind_speed", weather.getWind().getSpeed());
		return jsonObj;
	}
	
}
