package practicaMultiverse;

public class SpiderHam extends SpiderMan implements SpiderHamActions{

    public SpiderHam(String name, String appearance, int universe) {
        super(name, appearance, universe);
    }

    @Override
    public void spiderSense() {
        System.out.println("Spider-Ham felt a tingling. Something is approaching.");
    }

    @Override
    public void spiderNonsense() {
        System.out.println("Spider-Ham allows him to be \"cartoon-ier\" with the more danger he is in.");
    }

    @Override
    public void hammerBlow() {
        System.out.println("Spider-Ham took a immense hammer out of its pocket and <BAM>... he kicked something. .");
    }
}
