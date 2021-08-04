package block1.homework1_6;

public class AnimalShaker {
    public static void main(String[] args) {
        Animal[] animalArray = new Animal[]{new Dog(), new Cat(), new Fish(), new Bird()};
        for(Animal animal: animalArray){
            makeVoice(animal);
        }
    }
    private static void makeVoice(Animal animal){
        System.out.print(animal.name() + " is making: ");
        animal.voice();
    }
}