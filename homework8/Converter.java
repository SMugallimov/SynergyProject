package homework8;

import java.util.Scanner;

public interface Converter {
    double CDEG_FDEG = 32;
    double CDEG_KDEG = 273.15;
    double KDEG_FDEG = 459.67;
    double convert(double value);

    static Converter getConverter(Degrees degrees){
        return degrees.getConverter();
    }
}