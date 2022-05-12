package practicaMultiverse;

public class SpiderVerse {
    public static void main(String[] args) {
        tryGhostSpider();
        trySpiderBoy();
        trySpiderHam();
    }

    public static void tryGhostSpider(){
        GhostSpider ghostSpider = new GhostSpider("Peter Parker", "Amazing Spider-Man Annual #38", 11638);
        ghostSpider.spiderSense();
        ghostSpider.hellFire();
        ghostSpider.sinManipulation();
        ghostSpider.supernaturalAwareness();
    }
    public static void trySpiderBoy(){
        SpiderBoy spiderBoy = new SpiderBoy("Miles Morales", "Ultimate Fallout #4", 1610);
        spiderBoy.spiderCamouflage();
        spiderBoy.spiderSense();
        spiderBoy.venomBlast();
    }
    public static void trySpiderHam(){
        SpiderHam spiderHam = new SpiderHam("Peter Porker", "Marvel Tails Starring Peter Porker, the Spectacular Spider-Ham", 8311);
        spiderHam.spiderSense();
        spiderHam.spiderNonsense();
        spiderHam.hammerBlow();
    }
}