public class Cow extends Animal {
    String name;

    public Cow(String name) {
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("Mooooooooooooooo");
    }

    void milk() {
        System.out.println("The cow is being milked.");
    }

    void graze() {
        System.out.println("The cow is grazing.");
    }

    void sleep() {
        System.out.println("The cow is sleeping.");
    }

    void eat() {
        System.out.println("The cow is eating.");
    }

    @Override
    public String toString() {
        return this.name;
    }
}