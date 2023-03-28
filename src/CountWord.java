import java.util.LinkedList;
import java.util.List;

public class CountWord {
    public static void main(String[] args) {
        String phrase = "Hi my name is Dean and I am a software engineer";

        int numberOfWords = countWord(phrase);

        System.out.println(numberOfWords);
    }
    public static int countWord(String phrase) {
        String[] arraysOfWord = phrase.split(" ");
        return arraysOfWord.length;


    }
}
