package block1.homework1_8;

public enum Degrees {
    C_F(new CelsiusToFahrenheit()), F_C(new FahrenheitToCelcius()),
    C_K(new CelsiusToKelvin()), K_C(new KelvinToCelsius()),
    F_K(new FahrenheitToKelvin()), K_F(new KelvinToFahrenheit());

    private Converter convert;

    Degrees(Converter converter){
        this.convert = converter;
    }
    public Converter getConverter(){
        return this.convert;
    }
}
