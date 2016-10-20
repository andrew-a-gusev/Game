
public class Swordman extends Unit implements Fight,Movable{

    Swordman(){
        this.maxHP=90;
        this.damage=15;
        this.currentHP=maxHP;
    }

    @Override
    public void creat() {}


    @Override
    public void moveTo(int x, int y) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack(Unit unit) {
        unit.currentHP-=damage;
    }
}
