package practicaMona;

public class RedPolo extends Mona{
    public RedPolo(){
        super(null, "Red Polo", "Jeans", "boots", null);
    }

    @Override
    public void eat(){
        System.out.println("Red Polo is eating pizza.");
    }
    @Override
    public void sleep(){
        System.out.println("Red Polo is sleeping peacefully over his computer.");
    }
    @Override
    public void greet(){
        System.out.println("Red Polo: Hi!");
    }

    public void createAPI(){
        System.out.println("Red Polo is creating a new API.");
    }
    public void fixDatabase(){
        System.out.println("It looks like there is an error in the database fetching protocol, Red Polo will fix it right away.");
    }
}