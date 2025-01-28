package mentor12.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String sound, String breed) {
        super(name, sound);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
