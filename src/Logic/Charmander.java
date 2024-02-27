package Logic;

public class Charmander extends Pokemon implements IFire {

    public Charmander() {
    }

    @Override
    protected void tackleAtack() {
        System.out.println("Charmander used TACKLE");
    }

    @Override
    protected void scratchAtack() {
        System.out.println("Charmander used SCRATCH");
    }

    @Override
    protected void biteAtack() {
        System.out.println("Charmander used BITE");
    }

    @Override
    public void firePunch() {
        System.out.println("Charmander used FIRE PUNCH");
    }

    @Override
    public void flamethrower() {
        System.out.println("Charmander used FLAME THROWER");
    }
}
