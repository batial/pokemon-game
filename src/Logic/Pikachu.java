package Logic;

public class Pikachu extends Pokemon implements IElectric {

    @Override
    protected void tackleAtack() {
        System.out.println("Pikachu used TACKLE");
    }

    @Override
    protected void scratchAtack() {
        System.out.println("Pikachu used SCRATCH");
    }

    @Override
    protected void biteAtack() {
        System.out.println("Pikachu used BITE");
    }

    @Override
    public void thunder() {
        System.out.println("Pikachu used THUNDER");
    }

    @Override
    public void thunderPunch() {
        System.out.println("Pikachu used THUNDER PUNCH");
    }
}
