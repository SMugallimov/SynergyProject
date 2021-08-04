package block1.homework1_6;

public class Animal {
    public void voice() {
    }
    public String name(){
        return " ";
    }
}
class Dog extends Animal{
    @Override
    public void voice(){
    System.out.println("WOOF!! -- WOOF!!");
    }
    @Override
    public String name(){
        return "Dog";
    }
}
class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("MEU!! -- MEU!!");
    }
    @Override
    public String name(){
        return "Cat";
    }
}
class Fish extends Animal{
    @Override
    public void voice(){
        System.out.println("SPLASH!! -- SPLASH!!");
    }
    @Override
    public String name(){
        return "Fish";
    }
}
class Bird extends Animal{
    @Override
    public void voice(){
        System.out.println("CAW!! -- CAW!!");
    }
    @Override
    public String name(){
        return "Bird";
    }
}