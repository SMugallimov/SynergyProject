package block2.homework2_1;

public class CarLauncher {
    public static void main(String[] args) {
        Car carOne = new Car("carBrandOne", "carModelOne", new Driver("firstDriver"));

        Car carTwo = null;
        try{
            carTwo = carOne.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        carTwo.setBrand("carBrandTwo");
        carTwo.getDriver().setName("secondDriver");

        System.out.println(carOne);
        System.out.println(carTwo);
    }
}