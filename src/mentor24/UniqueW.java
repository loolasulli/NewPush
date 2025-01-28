package mentor24;

import java.util.HashSet;

public class UniqueW {
    public static void main(String[] args) {
        String sentence = "The same person always repeats the same words, but sometimes those words carry" +
                " unique meanings in different contexts.";
        HashSet<String> uniqueWords = new HashSet<>();
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for(String word: words) {
            uniqueWords.add(word);
        }

        for (String word: uniqueWords) {
            System.out.println(word);
        }
    }
}
