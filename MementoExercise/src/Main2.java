public class Main2 {

    public static void main(String[] args) {
        GameRole yao = new GameRole();
        yao.getInitState();
        yao.diaplayState();

        // save the process
        GameRoleMementoCareTaker careTaker = new GameRoleMementoCareTaker();
        careTaker.setMemento(yao.createMemento());

        yao.fight();
        yao.diaplayState();

        // restore from backup
        yao.restoreFromMemento(careTaker.getMemento());

        yao.diaplayState();
    }
}
