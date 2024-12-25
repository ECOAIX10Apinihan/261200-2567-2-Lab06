public class BeijingDuck extends Duck{
    public BeijingDuck(String name){
        super(name);
    }
    @Override
    public void clean(Animal animal){
        System.out.println(this + " splash splash " + animal);
    }
    public void beijingDuck(){
        System.out.println(" I am a Beijing Duck ");
    }
    
}
