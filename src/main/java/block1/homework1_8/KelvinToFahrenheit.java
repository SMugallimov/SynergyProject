package block1.homework1_8;

public class KelvinToFahrenheit implements Converter{
    @Override
    public double convert(double value){
        return value * 1.8 - 459.67;
    }
}
