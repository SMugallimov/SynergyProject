package block2.homework2_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NumbersOfWords {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String words = getWords();
        int numberOfWords = calculateNOfWords(words);
        System.out.println(numberOfWords);
        longestShortest(words);
    }
    public static String getWords(){
        System.out.println("Enter word(s)");
        String word = in.nextLine();
        return word;
    }
    public static int calculateNOfWords(String input){
        int count = 0;
        if(input.length() != 0)
        {
            count++;
        }
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void longestShortest(String word){
        List<String> words = Arrays.asList(word.split(" "));

        String shortestWord = words.stream().min(Comparator.comparing(shortest->shortest.length())).get();
        System.out.println(shortestWord + " is shortest word.");

        String longestWord = words.stream().max(Comparator.comparing(longest->longest.length())).get();
        System.out.println(longestWord + " is longest word.");
    }
}