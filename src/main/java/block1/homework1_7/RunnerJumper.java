package block1.homework1_7;

import java.util.Random;

public class RunnerJumper {
    public static void main(String[] args) {
        Participants[] participants = new Participants[3];
        Barrier[] barriers = new Barrier[6];

        Random rnd = new Random();
        int distance;
        int height;

        distance = rnd.nextInt(5);
        height = rnd.nextInt(5);
        participants[0] = new Cat("Cat", distance, height);

        distance = rnd.nextInt(5);
        height = rnd.nextInt(5);
        participants[1] = new Human("Human", distance, height);

        distance = rnd.nextInt(5);
        height = rnd.nextInt(5);
        participants[2] = new Robot("Robot", distance, height);

        boolean isTrack;
        for(int i = 0; i < barriers.length; i++){
            distance = rnd.nextInt(5);
            isTrack = rnd.nextBoolean();
            if(isTrack){
                barriers[i] = new Track("Track " + i, distance);
            }
            else{
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for(int i = 0; i < participants.length; i++){
            for(int j = 0; j < barriers.length; j++){
                if(!barriers[j].moving(participants[i])){
                    break;
                }
            }
        }
    }
}