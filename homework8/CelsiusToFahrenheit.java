package homework8;

public class CelsiusToFahrenheit implements Converter{
    @Override
    public double convert(double value){
        return value * 1.8 + 32;
    }
}
