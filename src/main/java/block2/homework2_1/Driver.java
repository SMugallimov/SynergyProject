package block2.homework2_1;

public class Driver implements Cloneable {
    private String name;

    public Driver(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected Driver clone() throws CloneNotSupportedException{
        return (Driver) super.clone();
    }
    @Override
    public String toString(){
        return "{" +
                "driver name='" + name + '\'' +
                '}';
    }
}