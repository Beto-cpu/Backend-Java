package practicaMona;

public class Dodgetocat extends Mona{
    public Dodgetocat(){
        super("Hair band", "tank top", "Blue short", "sneakers", "Ball");
    }

    @Override
    public void eat(){
        System.out.println("Dodgetocat is now eating a protein bar.");
    }
    @Override
    public void sleep(){
        System.out.println("Dodgetocat is sleeping after training.");
    }
    @Override
    public void greet(){
        System.out.println("Dodgetocat: Hello");
    }

    public void dodge(){
        System.out.println("Dodgetocat sees a ball coming and doges it.");
    }
    public void throwBall(){
        System.out.println("Dodgetocat aims and throws the ball.");
    }
}
