public class Pig extends Animal {
    String name;

    public Pig(String name) {
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("Oo Oo");
    }

    @Override
    public String toString() {
        return "Pig";
    }
}