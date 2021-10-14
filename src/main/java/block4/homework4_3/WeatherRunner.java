package block4.homework4_3;

import java.net.URL;

public class WeatherRunner {
    public static final String WEATHER_URL =
            "http://api.openweathermap.org/data/2.5/weather?q=Moscow, ru" +
                    "&units=metric&appid=3012510208027f9d646e63e490eb8e10";

    public static void main(String[] args) {
        URL url = JsonWeatherUtils.createUrl(WEATHER_URL);
        String result = JsonWeatherUtils.parseUrl(url);
        System.out.println("JSON:\n" + result);
        System.out.println();

        JsonWeatherUtils.parseCurrentWeather(result);
    }
}