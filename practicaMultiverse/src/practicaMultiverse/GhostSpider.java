package practicaMultiverse;

public class GhostSpider extends SpiderMan implements GhostSpiderActions{
    public GhostSpider(String name, String appearance, int universe) {
        super(name, appearance, universe);
    }

    @Override
    public void spiderSense() {
        System.out.println("GhostSpider felt a tingling. Something is approaching.");
    }

    @Override
    public void supernaturalAwareness() {
        System.out.println("GhostSpider is detecting some supernatural occurences around him.");
    }

    @Override
    public void hellFire() {
        System.out.println("GhostSpider projected a blast of mystical fire.");
    }

    @Override
    public void sinManipulation() {
        System.out.println("GhostSpider is manipulating the sins of a criminal, now his soul is purified...");

    }
}
