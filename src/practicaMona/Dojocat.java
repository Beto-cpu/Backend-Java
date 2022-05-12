package practicaMona;

public class Dojocat extends Mona{
    public Dojocat(){
        super("Balaclava", "Ninja Gear", "", "Ninja boots", "Katana");
    }

    @Override
    public void eat(){
        System.out.println("Dojocat is eating ninja food.");
    }
    @Override
    public void sleep(){
        System.out.println("Dojocat is sleep... where is he?");
    }
    @Override
    public void greet(){
        System.out.println("Dojocat: ...");
    }

    public void disapear(){
        System.out.println("Dojacat's presence dissolves in the mist. Now he is one with the environment.");
    }
    public void useKatana(){
        System.out.println("Dojacat makes a little tentacle movement, immediately your apple is separated into two slices.");
    }
}
