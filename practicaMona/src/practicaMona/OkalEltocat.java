package practicaMona;

public class OkalEltocat extends Mona{
    public OkalEltocat(){
        super("Black hair with fringe", "Super hero costume", "Red underwears", "Red boots", null);
    }

    @Override
    public void eat(){
        System.out.println("OkalEltocat is eating beef bourguignon with ketchup.");
    }
    @Override
    public void sleep(){
        System.out.println("OkalEltocat is sleeping in the moon.");
    }
    @Override
    public void greet(){
        System.out.println("OkalEltocat: Hello, Metropolis.");
    }

    public void fly(){
        System.out.println("OkalEltocat mantain himself in midair, without an efford.");
    }
    public void heatVision(){
        System.out.println("OkalEltocat stares at a empty soda can, instants alter he shoot a laser off his eyes that melts it.");
    }
}
