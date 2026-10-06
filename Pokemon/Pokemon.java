import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor
{
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;

    public Pokemon(int hp, int ap, String name, String attackName, String type) {
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.attack = new Attack(attackName);
        this.img = new GreenfootImage(name + ".png");
        this.outStatus = false;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void attack(String attackName, User enemy) {
        
    }

    public void takeDamage(int amount) {
        this.hp = this.hp - amount;
        if (this.hp <= 0) {
            this.hp = 0;
            this.outStatus = true;
        }
    }

    public void heal() {
        
    }

    public void printAttack() {
        
    }

    public int getAttackPower(String attackName, User enemy) {
        return this.attack.getPower();
    }

    public int getHp() {
        return this.hp;
    }

    public int getAp() {
        return this.ap;
    }

    public String getName() {
        return this.name;
    }

    public boolean isOut() {
        return this.outStatus;
    }

    public Attack getAttack() {
        return this.attack;
    }

    public void act()
    {
        // Add your action code here.
    }
}