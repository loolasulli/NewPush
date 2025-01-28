package mentor21;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String sentence = "Java is fun";
        builder.append(sentence).append(" and powerful").insert(0, "Indeed ").
                replace(15, 18, "awesome");
        System.out.println(builder.reverse());
    }
}
