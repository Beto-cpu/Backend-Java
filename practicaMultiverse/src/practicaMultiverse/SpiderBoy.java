package practicaMultiverse;

public class SpiderBoy extends SpiderMan implements SpiderBoyActions{

    public SpiderBoy(String name, String appearance, int universe) {
        super(name, appearance, universe);
    }

    @Override
    public void spiderSense() {
        System.out.println("Spider-Boy felt a tingling. Something is approaching.");
    }

    @Override
    public void venomBlast() {
        System.out.println("Spider-Boy discharged energy from his hands.");
    }

    @Override
    public void spiderCamouflage() {
        System.out.println("Spider-Boy blended into his surroundings.");
    }
}
