package basketball;

public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ForeignCenter(String name) {
//        this.name = name;
//    }

    public void attackInChinese() {
        System.out.println("Foreign center " + name + " is attacking.");
    }

    public void defendInChinese() {
        System.out.println("Foreign center " + name + " is defending.");
    }
}
