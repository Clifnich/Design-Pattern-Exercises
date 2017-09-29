package basketball;

public class Main {

    public static void main(String[] args) {
        Player b = new Forward("Tracy");
        b.attack();

        Player m = new Guard("Bartier");
        m.defend();

        Player yaoMin = new Translater("Yao Min");
        yaoMin.attack();
    }
}
