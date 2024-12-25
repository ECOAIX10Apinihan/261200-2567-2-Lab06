public class Lab06 {
    public static void main(String[] args) {
        Cow sleepCow = new Cow("Sleepy Cow");
        Duck firstDuck = new Duck("Donald Duck");
        Duck secondDuck = new Duck("Daisy Duck");
        Owl firsOwl = new Owl("Eiei Owl");
        Pig firsPig = new Pig("Mudeng Pig");
        sleepCow.sound();
        firstDuck.sound();
        firstDuck.clean(sleepCow);
        firstDuck.clean(secondDuck);
        secondDuck.clean(firstDuck);
        firsOwl.sound();
        firsPig.sound();
    }
}