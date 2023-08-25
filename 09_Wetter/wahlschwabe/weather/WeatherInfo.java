package wahlschwabe.weather;


public class WeatherInfo {
    
    private String timestamp;
    private Double temperature;

    WeatherInfo(String timestamp, Double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Double getTemperature() {
        return temperature;
    }
}
