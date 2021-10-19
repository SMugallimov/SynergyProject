package block4.homework4_3;

import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonWeatherUtils {

    //Метод для получения данных по указанной ссылке
    public static String parseUrl(URL url){
        if(url == null){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))){
            String string;
            while ((string = bufferedReader.readLine()) != null){
                stringBuilder.append(string);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    //метод для парсинга некоторых данных о погоде
    public static void parseCurrentWeather(String result){
        try{
            JSONObject weatherObject = (JSONObject) JSONValue.parseWithException(result);
            System.out.println("City name: " + weatherObject.get("name"));

            JSONArray weatherArray = (JSONArray) weatherObject.get("weather");
            JSONObject weatherData = (JSONObject) weatherArray.get(0);

            System.out.println("Current weather: " + weatherData.get("main"));
            System.out.println();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // метод для считывания URL с файла
    @SneakyThrows
    public static String getUrl(){
        String text;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/url.txt"))){
            while((text = bufferedReader.readLine()) != null){
                return text;
            }
        }
        return "";
    }

    // метод для создания объектя URL из указанной в параметре строки
    public static URL createUrl(){
        try{
            return new URL(getUrl());
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}