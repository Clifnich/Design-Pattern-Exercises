package basketball;

public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void defend() {
        System.out.println("Center " + name + " is defending.");
    }

    @Override
    public void attack() {
        System.out.println("Center " + name + " is attacking.");
    }
}
