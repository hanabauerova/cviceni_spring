package cz.vsb.pocasi.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.vsb.pocasi.dto.WeatherDto;
import cz.vsb.pocasi.service.WeatherService;
import cz.vsb.pocasi.City;

@RestController
public class WeatherController {
	WeatherService service;
	@RequestMapping("/weather")
	@CrossOrigin
	public Collection<WeatherDto> getWeather() {
		ArrayList<WeatherDto> weatherList=new ArrayList<>();
		service = new WeatherService();
		for(City city :City.values()) {
			WeatherDto weatherDto = service.getweWeatherForCity(city);
			weatherList.add(weatherDto);
		}
		return weatherList;
	}
	@RequestMapping("/weather/{city}")
	
	public WeatherDto getWeatherForCity(@PathVariable String city) {
		City cityEnum=City.valueOf(city.toUpperCase());
		service = new WeatherService();
		return service.getweWeatherForCity(cityEnum);
	}
	@RequestMapping("/weather/bruntal")
	public String getWeatherForCity() {
	
		return "<h1>Bruntál nenalezen!</h1> <img src='http://www.zubatezaby.cz/files/IMG_24.jpg'>";
	}
	@RequestMapping("/")
	public String home() {
		return "<h1>Home sweet home</h1>";
	}
	
}
