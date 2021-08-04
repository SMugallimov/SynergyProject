package block1.homework1_8;

public class CelsiusToKelvin implements Converter{
    @Override
    public double convert(double value){
        return value + 273.15;
    }
}
