package homework7;

public class Human {
    private String humanName;
    private int runDistance;
    private int jumpHeight;

    public Human(String humanName, int runDistance, int jumpHeight){
        this.humanName = humanName;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    public String getHumanName(){
        return humanName;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
    public void runTrack(Track track){
        if(track.getLength() <= getRunDistance()){
            System.out.println("Human " + getHumanName() + " was able to run "
                    + track.getLength() + " meters");
        }
        else{
            System.out.println("Human " + getHumanName() + " was unable to run distance "
                    + track.getLength() + " meters");
        }
    }
    public void jumpBarrier(Barrier barrier){
        if(barrier.getHeight() <= getJumpHeight()){
            System.out.println("Human " + getHumanName() + " was able to jump over a barrier with a height "
                    + barrier.getHeight() + " meters");
        }
        else{
            System.out.println("Human " + getHumanName() + " was unable to jump over a barrier with a height "
                    + barrier.getHeight() + " meters");
        }
    }
}
