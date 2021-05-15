package homework7;

public class Robot {
    private String robotName;
    private int runDistance;
    private int jumpHeight;

    public Robot(String robotName, int runDistance, int jumpHeight){
        this.robotName = robotName;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getRobotName() {
        return robotName;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
    public void runTrack(Track track){
        if(track.getLength() <= getRunDistance()){
            System.out.println("Robot " + getRobotName() + " was able to run "
                    + track.getLength() + " meters");
        }
        else{
            System.out.println("Robot " + getRobotName() + " was unable to run distance "
                    + track.getLength() + " meters");
        }
    }
    public void jumpBarrier(Barrier barrier){
        if(barrier.getHeight() <= getJumpHeight()){
            System.out.println("Robot " + getRobotName() + " was able to jump over a barrier with a height "
                    + barrier.getHeight() + " meters");
        }
        else{
            System.out.println("Human " + getRobotName() + " was unable to jump over a barrier with a height "
                    + barrier.getHeight() + " meters");
        }
    }
}
