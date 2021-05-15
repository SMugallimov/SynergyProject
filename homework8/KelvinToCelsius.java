package homework8;

public class KelvinToCelsius implements Converter{
    @Override
    public double convert(double value){
        return value - CDEG_KDEG;
    }
}
