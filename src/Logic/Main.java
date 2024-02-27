package Logic;

public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();

        charm.scratchAtack();
        charm.flamethrower();

        pika.scratchAtack();
        pika.thunderPunch();

        bulbasaur.scratchAtack();
        bulbasaur.razorLeaf();

        squirtle.biteAtack();
        squirtle.bubbleBeam();
    }
}