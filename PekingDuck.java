public class   PekingDuck extends Duck{
    public PekingDuck(String name){
        super(name);
    }
    @Override
    public void clean(Animal animal){
        System.out.println(this + " splash splash " + animal);
    }
    public void pekingDuck(){
        System.out.println(" I am a PekingDuck Duck ");
    }
    public void beCrispy(){
        System.out.println(" อาหร่อยมาก ");
    }
}
