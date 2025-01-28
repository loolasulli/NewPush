package mentor11;

import java.util.UUID;

public class Main2 {
    public static void main(String[] args) {

        Person1 person1 = new Person1(UUID.randomUUID().toString(),"Lala", 28);
        Person1 person2 = new Person1(UUID.randomUUID().toString(),"Ashraf", 34);
        Person1 person3 = new Person1(UUID.randomUUID().toString(),"Diana", 2);
        person1.introduce();
        person2.introduce();
        person3.introduce();
        Person1.getPopulation();
    }
}
