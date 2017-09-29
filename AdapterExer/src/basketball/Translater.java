package basketball;

public class Translater extends Player {

    private ForeignCenter yaoMin = new ForeignCenter();

    @Override
    public void attack() {
        yaoMin.attackInChinese();
    }

    @Override
    public void defend() {
        yaoMin.defendInChinese();
    }

    public Translater(String name) {
        super(name);
        yaoMin.setName(name);
    }
}
