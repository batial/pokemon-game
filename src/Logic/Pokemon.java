package Logic;

public abstract class Pokemon {
    protected int pokeNum;
    protected String pokeName;
    protected double pokeWeight;
    protected  String sex;
    protected int season;

    protected abstract void tackleAtack();
    protected abstract void scratchAtack();

    protected abstract void biteAtack();

}
