package block1.homework1_7;

public class Human implements Participants {
    private String humanName;
    private int runDistance;
    private int jumpHeight;

    public Human(String humanName, int runDistance, int jumpHeight){
        this.humanName = humanName;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void run(){
        System.out.println(this.humanName + " is running " + this.getRunDistance());
    }
    @Override
    public void jump(){
        System.out.println(this.humanName + " is jumping " + this.getJumpHeight());
    }
    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}