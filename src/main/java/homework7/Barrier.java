package homework7;

public abstract class Barrier {
    private String name;

    public Barrier(String name){
        this.name = name;
    }
    protected abstract boolean moving(Participants participants);

    public String getName() {
        return name;
    }
}