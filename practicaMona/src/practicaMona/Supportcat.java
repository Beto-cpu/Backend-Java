package practicaMona;

public class Supportcat extends Mona {
    public  Supportcat(){
        super("Hearphones", null, null, null, "Mail");
    }

    @Override
    public void eat(){
        System.out.println("Supportcat is eating within their 15 minutes break.");
    }
    @Override
    public void sleep(){
        System.out.println("Supportcat is taking a fast nap.");
    }
    @Override
    public void greet(){
        System.out.println("Dodgetocat: Hello, how can I help you today?");
    }

    public void listen(){
        System.out.println("Supportcat is listen the client's problem.");
    }
    public void giveSolution(){
        System.out.println("Supportcat is giving instructions to solve your problem (lets hope it works).");
    }
}
