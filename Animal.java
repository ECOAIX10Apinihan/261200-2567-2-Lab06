public abstract class Animal {
    abstract void sound();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}