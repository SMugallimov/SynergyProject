package homework7;

public class Track extends Barrier{
    private int length;

    public Track(String name, int length){
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    @Override
    protected boolean moving(Participants participants){
        System.out.println(super.getName() + " length is " + this.length);
        participants.run();

        if(getLength() <= participants.getRunDistance()){
            System.out.println("It is successful run))!");
            System.out.println();
            return true;
        }
        else{
            System.out.println("It is unsuccessful run((!");
            System.out.println();
            return false;
        }
    }
}