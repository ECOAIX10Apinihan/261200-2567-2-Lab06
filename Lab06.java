public class Lab06 {
    public static void main(String[] args) {
        Cow sleepCow = new Cow("Sleepy Cow");
        Duck firstDuck = new Duck("Donald Duck");
        Duck secondDuck = new Duck("Daisy Duck");
        Owl firstOwl = new Owl("Eiei Owl");
        Pig firstPig = new Pig("Mudeng Pig");
        PekingDuck pekingDuck = new PekingDuck("Peking Duck");

        sleepCow.sound();
        firstDuck.sound();
        secondDuck.sound();
        firstOwl.sound();
        firstPig.sound();
        pekingDuck.sound();

        firstDuck.fly();
        firstDuck.glide();
        firstDuck.clean(sleepCow);

        pekingDuck.clean(firstDuck);
        pekingDuck.pekingDuck();
        pekingDuck.beCrispy();
    }
}