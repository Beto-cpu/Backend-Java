package practicaMona;

public class TryMona {
    public static void main(String[] args) {
        RedPolo redPolo = new RedPolo();
        Dojocat dojocat = new Dojocat();
        Linktocat linktocat = new Linktocat();
        Dodgetocat dodgetocat = new Dodgetocat();
        OkalEltocat okalEltocat = new OkalEltocat();
        Supportcat supportcat = new Supportcat();

        redPolo.eat();
        redPolo.createAPI();

        dojocat.eat();
        dojocat.disapear();

        linktocat.eat();
        linktocat.playOcarina();

        dodgetocat.eat();
        dodgetocat.dodge();

        okalEltocat.eat();
        okalEltocat.fly();

        supportcat.eat();
        supportcat.giveSolution();
    }
}
