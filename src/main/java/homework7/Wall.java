package homework7;

public class Wall extends Barrier{
    private int height;

    public Wall(String name, int height){
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    protected boolean moving (Participants participants){
        System.out.println(super.getName() + " height is " + this.height);
        participants.jump();
        if(getHeight() <= participants.getJumpHeight()){
            System.out.println("It is successful jump))!");
            System.out.println();
            return true;
        }
        else{
            System.out.println("It is unsuccessful jump((!");
            System.out.println();
            return false;
        }
    }
}