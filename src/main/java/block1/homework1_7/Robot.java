package block1.homework1_7;

public class Robot implements Participants {
    private String robotName;
    private int runDistance;
    private int jumpHeight;

    public Robot(String robotName, int runDistance, int jumpHeight){
        this.robotName = robotName;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void run(){
        System.out.println(this.robotName + " is running " + this.getRunDistance());
    }
    @Override
    public void jump(){
        System.out.println(this.robotName + " is jumping " + this.getJumpHeight());
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