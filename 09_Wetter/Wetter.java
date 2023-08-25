import java.util.Scanner;
import wahlschwabe.weather.WeatherFetcher;
import wahlschwabe.weather.WeatherInfo;

public class Wetter {
    public static void main(String[] args) throws Exception {
        System.out.println("Welche Stadt? ");
        Scanner input = new Scanner(System.in);
        String city = input.next();

        WeatherFetcher w = WeatherFetcher.getInstance();
        WeatherInfo[] weatherInfos = w.fetch(city);

        for (int x = 0; x < weatherInfos.length; x++) {
            WeatherInfo weatherInfo = weatherInfos[x];
            System.out.println(weatherInfo.getTimestamp() + ": " + weatherInfo.getTemperature());
        }
        
    }
}
