package homework3;

public class SimpleNumbers {
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; i++){
            boolean isSimple = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0 && i % 1 == 0){
                    isSimple = false;
                }
            }
            if(isSimple){
                System.out.println(i);
            }
        }
    }
}