package practicaMona;

public class Mona {
    private String hair, topWear, bottomWear, shoes, tool;

    public Mona(){}
    public Mona(String hair, String topWear, String bottomWear, String shoes, String tool){
        this.hair = hair;
        this.topWear = topWear;
        this.bottomWear = bottomWear;
        this.shoes = shoes;
        this.tool = tool;
    }

    public String getHair() {
        return hair;
    }
    public String getTopWear() {
        return topWear;
    }
    public String getBottomWear() {
        return bottomWear;
    }
    public String getShoes() {
        return shoes;
    }
    public String getTool() {
        return tool;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
    public void setTopWear(String topWear) {
        this.topWear = topWear;
    }
    public void setBottomWear(String bottomWear) {
        this.bottomWear = bottomWear;
    }
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    public void setTool(String tool) {
        this.tool = tool;
    }

    public void eat(){
        System.out.println("Mona the Octocat is eating a tuna sandwich.");
    }
    public void sleep(){
        System.out.println("Mona the Octocat is sleeping peacefully.");
    }
    public void greet(){
        System.out.println("Mona: Hi!");
    }
}
