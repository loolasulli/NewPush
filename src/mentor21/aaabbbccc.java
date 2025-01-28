package mentor21;

public class aaabbbccc {
    public static void main(String[] args) {
        String word = "aaabbbbcc";
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(word.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(word.charAt(word.length() - 1)).append(count);
        System.out.println(compressed);
    }
}
