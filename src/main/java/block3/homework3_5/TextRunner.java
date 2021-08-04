package block3.homework3_5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TextRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = Arrays.stream(
                in.nextLine().toLowerCase().replace('.', ' ').replace(',', ' ')
                        .split("\\s+"))

                .collect(Collectors.toMap(Function.identity(), k -> 1, Integer::sum))
                .entrySet().stream()
                .sorted(Comparator
                        .comparingInt(e -> -(int) ((Map.Entry) e).getValue())
                        .thenComparing(e -> (String) ((Map.Entry) e).getKey()))

                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum,
                        LinkedHashMap::new));

        map.forEach((k, v) -> System.out.println(v + "x " + k));
    }
}