package block1.homework1_7;

public class Cat implements Participants {
    private String catName;
    private int runDistance;
    private int jumpHeight;

    public Cat(String catName, int runDistance, int jumpHeight){
        this.catName = catName;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void run(){
        System.out.println(this.catName + " is running " + this.getRunDistance());
    }
    @Override
    public void jump(){
        System.out.println(this.catName + " is jumping " + this.getJumpHeight());
    }
    @Override
    public int getRunDistance(){
        return this.runDistance;
    }
    @Override
    public int getJumpHeight(){
        return this.jumpHeight;
    }
}