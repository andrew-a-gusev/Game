
abstract class Main extends Unit{

    public static void main(String[] args){
        Swordman swordman = new Swordman();
        Archer archer = new Archer();
        archer.attack(swordman);
        for (int i=0; i<10; i++) {
            swordman.attack(archer);
            if (archer.currentHP<0) break;
            System.out.println(archer.currentHP);
        }
        System.out.print(swordman.currentHP);
    }

}

