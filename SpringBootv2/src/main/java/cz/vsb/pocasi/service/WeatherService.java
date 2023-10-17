package cz.vsb.pocasi.service;

import org.springframework.stereotype.Service;

import cz.vsb.pocasi.City;
import cz.vsb.pocasi.connector.WeatherstackConnector;
import cz.vsb.pocasi.dto.WeatherDto;
import cz.vsb.pocasi.dto.WeatherstackDto;

@Service
public class WeatherService {
	public WeatherDto getweWeatherForCity(City cityEnum) {
		WeatherstackConnector connector = new WeatherstackConnector();
		WeatherstackDto weatherstackData= connector.getWeatherForCity(cityEnum);
		return transformDto(weatherstackData);
	}
	private WeatherDto transformDto(WeatherstackDto weatherstackData) {
		WeatherDto wdto = new WeatherDto();
		wdto.setLocation(weatherstackData.getLocation().getName());
		wdto.setRel_humidity(weatherstackData.getCurrent().getHumidity());
		wdto.setTemp_cellsius(weatherstackData.getCurrent().getTemperature());
		wdto.setTimestamp(weatherstackData.getLocation().getLocaltime());
		wdto.setWeatherDescription(weatherstackData.getCurrent().getWeather_descriptions().toString());
		wdto.setWindDirection(weatherstackData.getCurrent().getWind_dir());
		wdto.setWindSpeed_mps(weatherstackData.getCurrent().getWind_speed());
		return wdto;
	}
	
	
	
}
