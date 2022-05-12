package practicaMona;

public class Linktocat extends Mona{
    public Linktocat(){
        super("Blond and green hat", "Green Tunic", null, "Warrior boots", "Time Sword");
    }

    @Override
    public void eat(){
        System.out.println("Linktocat is drinking a bottle of milk.");
    }
    @Override
    public void sleep(){
        System.out.println("Linktocat is sleeping by the campfire.");
    }
    @Override
    public void greet(){
        System.out.println("Linktocat: HYA");
    }

    public void playOcarina(){
        System.out.println("Linktocat take out his ocarina and plays \"Zelda's Lullaby\".");
    }
    public void roll(){
        System.out.println("Linktocat does a fast movement that makes him roll over himself. For some reason he is moving faster than running.");
    }
}
