public class GameRole {

    private int vitality;
    private int attack;
    private int defend;

    public void diaplayState() {
        System.out.println("Current state: ");
        System.out.println("\tVitality: " + vitality);
        System.out.println("\tAttack: " + attack);
        System.out.println("\tDefend: " + defend);
    }

    public void getInitState() {
        vitality = 100;
        attack = 100;
        defend = 100;
    }

    public void fight() {
        vitality = 0;
        attack = 0;
        defend = 0;
    }

    public GameRoleMemento createMemento() {
        return new GameRoleMemento(vitality, attack, defend);
    }

    public void restoreFromMemento(GameRoleMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defend = memento.getDefend();
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }
}
