
/**
 * Обычно, класс с методом main делают public, не делают abstract и наследование от Unit не понятно зачем
 */
abstract class Main extends Unit{

    public static void main(String[] args){

        Swordman swordman = new Swordman();
        Archer archer = new Archer();

        archer.attack(swordman);
        System.out.println(swordman.currentHP);

        for (int i=0; i<10; i++) {
            swordman.attack(archer);
            if (archer.currentHP<0) break;
            System.out.println(archer.currentHP);
        }
    }

}

