package basketball;

public class Forward extends Player {

    public Forward(String name) {
        super(name);
    }

    @Override
    public void defend() {
        System.out.println("Forward " + name + " is defending.");
    }

    @Override
    public void attack() {
        System.out.println("Forward " + name + " is attacking.");
    }
}
