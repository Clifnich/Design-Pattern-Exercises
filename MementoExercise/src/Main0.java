public class Main0 {

    public static void main(String[] args) {
        GameRole yao = new GameRole();
        yao.getInitState();
        yao.diaplayState();

        // save the process
        GameRole backup = new GameRole();
        backup.setVitality(yao.getVitality());
        backup.setAttack(yao.getAttack());
        backup.setDefend(yao.getDefend());

        yao.fight();
        yao.diaplayState();

        // restore from backup
        yao.setDefend(backup.getDefend());
        yao.setAttack(backup.getAttack());
        yao.setVitality(backup.getVitality());

        yao.diaplayState();
    }
}
