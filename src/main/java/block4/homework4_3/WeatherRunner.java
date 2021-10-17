package block4.homework4_3;

import java.net.URL;

public class WeatherRunner {

    public static void main(String[] args) {
        URL url = JsonWeatherUtils.createUrl();
        String result = JsonWeatherUtils.parseUrl(url);
        System.out.println("JSON:\n" + result);
        System.out.println();

        JsonWeatherUtils.parseCurrentWeather(result);
    }
}