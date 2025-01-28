package mentor12.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Some sound");
        animal.makeSound();
        animal.displayInfo();
        Animal animal1 = new Dog("Ragnar", "Woof Woof", "Golden Retriever");
        animal1.makeSound();
        animal1.displayInfo();
    }
}
