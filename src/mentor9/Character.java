package mentor9;

public class Character {
    String name;
    int health;
    int strength;
    int level;
    String[] inventory;

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.strength = 100;
        this.level = 1;
        this.inventory = new String[4];
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }

    public void attack() {
        System.out.println("Attacking.. ");
        health -= 10;
    }

    public void heal() {
        System.out.println("Healing.. ");
            health += 10;
    }

    public void showInventory() {
        System.out.println("Inventory: ");
        for (String item : inventory) {
            if (item.equals(" ")) {
                System.out.println(item);
            }
        }
    }

    public void useItem(int itemIndex) {
        if (inventory[itemIndex].equals(" ")) {
            String item = inventory[itemIndex];
            if (item.equals("Potion")) {
                heal();
                inventory[itemIndex] = " ";
            }
        } else {
            System.out.println("Invalid item");
        }
    }

}
