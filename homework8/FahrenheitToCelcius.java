package homework8;

public class FahrenheitToCelcius implements Converter{
    @Override
    public double convert(double value){
        return (value - CDEG_FDEG) / 1.8;
    }
}
