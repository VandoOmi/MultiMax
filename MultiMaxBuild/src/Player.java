public class Player {
    int hp;
    int heart;
    int antilife;

    void heal() {
        hp=hp+1000;
        heart++;
    }
    void damageDealed(int damage) {
        antilife=antilife+damage;
    }
    void damageTaked(int damage) {
        hp=hp-damage;
        if (hp<heart*1000){
            heart--;
        }
    }



}
