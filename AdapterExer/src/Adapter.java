public class Adapter extends Target{

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    private Adaptee adaptee = new Adaptee();
}
