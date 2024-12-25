public class Lab06 {
    public static void main(String[] args) {
        Cow sleepCow = new Cow();
        sleepCow.sound();
        Duck firstDuck = new Duck("Donald Duck");
        Duck secondDuck = new Duck("Daisy Duck");
        firstDuck.sound();
        firstDuck.clean(sleepCow);
        firstDuck.clean(secondDuck);
        secondDuck.clean(firstDuck);
        Owl firsOwl = new Owl();
        firsOwl.sound();
        Pig firsPig = new Pig();
        firsPig.sound();
    }
}