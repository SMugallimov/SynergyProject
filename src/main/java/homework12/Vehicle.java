package homework12;

public class Vehicle {

    private String vehicleType;
    private int plate;
    private int speed;
    private int weight;
    private double width;
    private int height;
    private int length;

    public Vehicle(String vehicleType, int plate, int speed, int weight, double width, int height, int length){
        this.vehicleType = vehicleType;
        this.plate = plate;
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public String vehicleSpeed() throws OverSpeedException {
        if (this.getSpeed() > 80 && this.getSpeed() <= 100) throw new OverSpeedException("Exception: Over speed by: "
                + this.getSpeed());
        else if (this.getSpeed() > 100)
            throw new OverSpeedException("Exception: Alert! Over speed! " + this.getSpeed() + " KM/HRS" +
                    ". You are under police arrest!");
        else {
            return "Your speed is: " + getSpeed() + " KM/HRS";
        }
    }
    public String vehicleDimensions() throws OverDimensionsException {
        if (this.getWeight() > 8 || this.getHeight() > 4 || this.getWidth() > 2.5)
            throw new OverDimensionsException("Over dimension exception: Trip is prohibited! Plate: "
                    + this.getPlate());
        else {
            return "Trip is approved.";
        }
    }

    public String name(){
        return " ";
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}