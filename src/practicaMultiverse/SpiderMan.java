package practicaMultiverse;

public class SpiderMan {
    private String name, appearance;
    private int universe;

    public SpiderMan(String name, String appearance, int universe){
        this.name = name;
        this.appearance = appearance;
        this.universe = universe;
    }

    public String getName() {
        return name;
    }
    public String getAppearance() {
        return appearance;
    }
    public int getUniverse() {
        return universe;
    }

    @Override
    public String toString() {
        return "SpiderMan \n" +
            "\n name        :   '"  + name        + "'." +
            "\n appearance  :   '"  + appearance  + "'." +
            "\n universe    :   '"  + universe    + "'.";
    }
}
