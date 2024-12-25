public class Owl extends Animal {
    String name;

    public Owl(String name) {
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("Hu Hu");
    }

    @Override
    public String toString() {
        return this.name;
    }
}