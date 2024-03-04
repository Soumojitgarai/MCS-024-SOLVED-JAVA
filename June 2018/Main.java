// Interface for aquatic animals
interface Aquatic {
    void swim();
}

// Interface for flying animals
interface Flying {
    void fly();
}

// Interface for amphibious animals (combines both)
interface Amphibious extends Aquatic, Flying {
    void land(); // Unique method for amphibious animals
}

// Penguin class implements Amphibious, inheriting methods from both interfaces
class Penguin implements Amphibious {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Penguin cannot fly, but uses flippers for propulsion.");
    }

    @Override
    public void land() {
        System.out.println("Penguin is waddling on land.");
    }
}

public class Main {
    public static void main(String[] args) {
        Amphibious penguin = new Penguin();
        penguin.swim(); // Calls Penguin's implementation
        penguin.fly();   // Calls Penguin's implementation
        penguin.land();  // Calls Penguin's implementation
    }
}
