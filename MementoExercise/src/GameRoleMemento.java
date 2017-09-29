public class GameRoleMemento {

    private int vitality;
    private int attack;
    private int defend;

    public GameRoleMemento(int vitality, int attack, int defend) {
        this.vitality = vitality;
        this.attack = attack;
        this.defend = defend;
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

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
}
