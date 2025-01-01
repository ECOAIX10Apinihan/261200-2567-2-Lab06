public class Duck extends Animal implements Flyable {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println("prub prub");
    }
    public void glide(){
        System.out.println("weeeee weeeeee");
    }
    public void sound() {
        System.out.println("quack quack");
    }

    public void clean(Animal animal) {
        System.out.println(this + " splash splash " + animal);
    }

    public String toString() {
        return this.name;
    }
}