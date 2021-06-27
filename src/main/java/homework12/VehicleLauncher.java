package homework12;

import java.util.Random;

public class VehicleLauncher {
    public static void main(String[] args) throws OverSpeedException {

        Vehicle[] vehicles = new Vehicle[20];
        Random rnd = new Random();

        int plate;
        int low = 100;
        int high = 999;
        int speed;
        int weight;
        int height;
        int length;
        double width;

        for (int i = 0; i < vehicles.length; i++) {
            plate = rnd.nextInt(high - low) + low;
            speed = rnd.nextInt(200);
            weight = rnd.nextInt(20);
            height = rnd.nextInt(3);
            length = rnd.nextInt(15);
            width = Math.random() * 3;

            if (weight > 5 && height > 2 && length > 4 && width > 1.5) {
                vehicles[i] = new Track(plate, speed, weight, width, height, length);
            } else {
                vehicles[i] = new LightCar (plate, speed, weight, width, height, length);
            }
        }
        for (Vehicle vehicle: vehicles) {
            try {
                System.out.println(vehicle.vehicleSpeed());
                System.out.println(vehicle.vehicleDimensions());
            }
            catch (OverSpeedException ex) {
                System.out.println(ex.getMessage());
            }
            catch (OverDimensionsException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}