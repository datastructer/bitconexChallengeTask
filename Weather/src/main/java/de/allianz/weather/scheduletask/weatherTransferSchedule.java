package de.allianz.weather.scheduletask;


import java.util.HashMap;
import java.util.Map;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class weatherTransferSchedule {
	
	@Scheduled(fixedRate = 600000)
	private void getWeatherData() {
		try {		
			RestTemplate restTemplate = new RestTemplate();						 
			Map<String, String> params = new HashMap<>();
			params.put("city name", "Buchloe");
			params.put("API key", "c7ca3aa7935acf93d30fb3959c8c3ed0");			
			String result = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}", 
				    String.class, params);
			//test
			System.out.println(result);
			
		} catch (RestClientException ex) {
            System.out.println(ex.getMessage());
        }	
		
	}

}
