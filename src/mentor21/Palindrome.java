package mentor21;

public class Palindrome {
    public static void main(String[] args) {
        String word = "amma";
        StringBuilder builder = new StringBuilder();
        builder.append(word.toLowerCase());
        System.out.println(builder.toString().equals(word));

        }
    }


