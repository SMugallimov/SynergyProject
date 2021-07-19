package homework16.part2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UnionItersect {
    public static void main(String[] args) {
        Set <Integer> firstSet = new HashSet<>();
        int counter1 = 0;
        int counter2 = 10;
        Random rnd = new Random();
        while(counter1 < 20){
            firstSet.add(rnd.nextInt(20) + 1);
            counter1++;
        }
        printSet("First set", firstSet);

        Set <Integer> secondSet = new HashSet<>();
        while(counter2 < 20){
            secondSet.add(rnd.nextInt(20) + 1);
            counter2++;
        }
        printSet("Second set", secondSet);

        printSet("Union set", union(firstSet, secondSet));

        printSet("Intersect set", intersect(firstSet, secondSet));
    }
    private static Set<Integer> union(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> unionSet = new HashSet<>(firstSet);
        unionSet.addAll(secondSet);
        return unionSet;
    }
    private static void printSet(String string, Set <Integer> set) {
        if (set.size() != 0) {
            System.out.print(string + " - ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }
    }
    private static Set <Integer> intersect(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> intersectSet = new HashSet<>();
        for (Integer firstSetElement : firstSet) {
            for (Integer secondSetElement : secondSet) {
                if (firstSetElement == secondSetElement) {
                    intersectSet.add(firstSetElement);
                }
            }
        }
        return intersectSet;
    }
}
