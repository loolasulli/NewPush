package mentor9;

public class VirtualPet {
    String name;
    int age;
    int health;

    static int petCount = 0;

    @Override
    public String toString() {
        return "VirtualPet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", petCount=" + petCount +
                '}';
    }

    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        petCount++;
    }

    public VirtualPet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
        petCount++;

        }

        void feed() {
        if (health > 100) {
            health = 100;
        } else {
            health += 10;
        }
        }

        void play() {
            if (health < 0) {
                health = 0;
            } else {
                health -= 5;
            }
        }

        void sleep() {
            if (health > 100) {
                health = 100;
            } else {
                health += 15;
            }
        }

        public static int getTotalPets() {
        return petCount;
        }

        }

