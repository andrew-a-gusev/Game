
public abstract class Unit {
    int currentHP;
    int maxHP;
    int damage;
    /**
     * create - в сущности выполняет роль конструктора, 
     * те можно было создать базовый конструктор (maxHP, damage) и вызывать его в конструкторах наследников
     */
    public abstract void creat();
}
