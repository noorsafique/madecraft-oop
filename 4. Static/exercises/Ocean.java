package exercises;

public class Ocean {
    public static void main(String[] args) {
        SeaCreature spongebob= new SeaCreature("Spongebob");
        SeaCreature patrick= new SeaCreature("Patrick");
        SeaCreature squidward= new SeaCreature("Squidward");
        System.out.println(spongebob.getName());
        spongebob.eat();
        //spongebob.laugh();
    }

}
