package block1.homework1_8;

public class FahrenheitToKelvin implements Converter{
    @Override
    public double convert(double value) {
        return (value + KDEG_FDEG) / 1.8;
    }
}
