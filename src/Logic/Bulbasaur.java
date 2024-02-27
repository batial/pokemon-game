package Logic;

public class Bulbasaur extends Pokemon implements IGrass{
    public Bulbasaur() {
    }

    @Override
    protected void tackleAtack() {
        System.out.println("Bulbasour used TACKLE");
    }

    @Override
    protected void scratchAtack() {
        System.out.println("Bulbasour used SCRATCH");
    }

    @Override
    protected void biteAtack() {
        System.out.println("Bulbasour used BITE");
    }

    @Override
    public void razorLeaf() {
        System.out.println("Bulbasour used RAZOR LEAF");
    }

    @Override
    public void StunSpore() {
        System.out.println("Bulbasour used STUN SPORE");
    }
}
