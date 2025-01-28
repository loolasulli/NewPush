package mentor10;

public class HeapAndStackDemo {

    public static int factorial(int n) {
        int result = 1, i;
        if (n == 0) {
            return 1;
        }
        for (i = 0; i < n; i++) {
            result *= (n - i);
        }
        return result;
    }


    public void createObjects() {
        Person[] people = new Person[3];
        people[0] = new Person("Diana", 2);
        people[1] = new Person("Ashraf", 34);
        people[2] = new Person("Lale", 28);
        System.out.println("~  ~  ~  ~ \nPerson objects' details before the modification:");
        for (Person person : people) {
            System.out.println(person);
        }
        people[2].setName("\u001B[31mLala\u001B[0m");
        System.out.println("~  ~  ~  ~ \nPerson objects' details after the modification:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}