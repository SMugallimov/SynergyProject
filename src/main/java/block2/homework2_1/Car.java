package block2.homework2_1;

public class Car implements Cloneable{
    private String brand;
    private String model;
    private Driver driver;

    public Car(String brand, String model, Driver driver){
        this.brand = brand;
        this.model =model;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.driver = (Driver) driver.clone();
        return car;
    }
    @Override
    public String toString(){
        return this.brand+" {" +
                "model=" + model +
                ",driver=" + driver +
                '}';
    }
}