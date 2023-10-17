package cz.vsb.pocasi.dto;

public class WeatherDto {
	private String location;
	private String timestamp;
	private double temp_cellsius;
	private int rel_humidity;
	private double windSpeed_mps;
	private String windDirection;
	private String weatherDescription;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public double getTemp_cellsius() {
		return temp_cellsius;
	}
	public void setTemp_cellsius(double temp_cellsius) {
		this.temp_cellsius = temp_cellsius;
	}
	public int getRel_humidity() {
		return rel_humidity;
	}
	public void setRel_humidity(int rel_humidity) {
		this.rel_humidity = rel_humidity;
	}
	public double getWindSpeed_mps() {
		return windSpeed_mps;
	}
	public void setWindSpeed_mps(double windSpeed_mps) {
		this.windSpeed_mps = windSpeed_mps;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
}
