package homework11;

public class Ages {
    public void getAges(int age){
        if(age < 1 || age > 110){
            throw new IllegalArgumentException("Invalid age!");
        }
        int newAge = age;
    }
}