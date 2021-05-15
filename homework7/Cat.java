package homework7;

public class Cat {
    private String catName;
    private int runDistance;
    private int jumpHeight;

    public Cat(String catName, int runDistance, int jumpHeight){
        this.catName = catName;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getCatName() {
        return catName;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
    public void runTrack(Track track){
        if(track.getLength() <= getRunDistance()){
            System.out.println("Cat " + getCatName() + " was able to run " + track.getLength() + " meters");
        }
        else{
            System.out.println("Cat " + getCatName() + " was unable to run " + track.getLength() + "meters");
        }
    }
    public void jumpBarrier(Barrier barrier){
        if(barrier.getHeight() <= getJumpHeight()){
            System.out.println("Cat " + getCatName() + " was able to jump over a barrier with a height "
                    + barrier.getHeight() + " meters");
        }
        else{
            System.out.println("Cat " + getCatName() + " was unable to jump over a barrier with a height "
                    + barrier.getHeight() + " meters");
        }
    }
}
