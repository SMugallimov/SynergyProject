package homework8;

public class CelsiusToKelvin implements Converter{
    @Override
    public double convert(double value){
        return value + 273.15;
    }
}
