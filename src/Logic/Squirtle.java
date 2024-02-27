package Logic;

public class Squirtle extends Pokemon implements IWater{
    @Override
    protected void tackleAtack() {
        System.out.println("Squirtle used TACKLE");
    }

    @Override
        protected void scratchAtack() {
        System.out.println("Squirtle used SCRATCH");
    }

    @Override
    protected void biteAtack() {
        System.out.println("Squirtle used BITE");
    }

    @Override
    public void waterGun() {
        System.out.println("Squirtle used WATER GUN");
    }

    @Override
    public void bubbleBeam() {
        System.out.println("Squirtle used BUBBLE BEAM");
    }
}
