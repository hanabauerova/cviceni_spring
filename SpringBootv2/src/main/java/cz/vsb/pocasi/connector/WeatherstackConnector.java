package cz.vsb.pocasi.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cz.vsb.pocasi.City;
import cz.vsb.pocasi.dto.WeatherstackDto;

public class WeatherstackConnector {
	//http://api.weatherstack.com/current?access_key=1bf9b058bdc1fa6d444c9406adc963cc&query=New%20York
	private static String baseUrl="http://api.weatherstack.com/";
	private static String params="current?access_key=";
	private static String ApiKey="1bf9b058bdc1fa6d444c9406adc963cc";
	
	private static String url = baseUrl+params+ApiKey+"&query=";
		
	public WeatherstackDto getWeatherForCity (City cityEnum) {
		RestTemplate template= new RestTemplate();
		URI uri = null;
		try {
			uri = new URI(url+cityEnum);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		ResponseEntity<WeatherstackDto> response=template.getForEntity(uri,WeatherstackDto.class);
		return response.getBody();
		
		
	}
}
