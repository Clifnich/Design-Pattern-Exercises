package basketball;


public class Guard extends Player{

    public Guard(String name) {
        super(name);
    }

    @Override
    public void defend() {
        System.out.println("Guard " + name + " is defending.");
    }

    @Override
    public void attack() {
        System.out.println("Guard " + name + " is attacking.");
    }
}
