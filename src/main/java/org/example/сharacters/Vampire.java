package org.example.сharacters;

public class Vampire extends Warrior{
    private static final int ATTACK = 4;
    private static final int VAMPIRISM =  50;
    private static final int HP = 40;

    public Vampire() {
        super(HP);
    }

    @Override
    public void dealDamage(Warrior warrior) {
        int prevWarHP = warrior.getHealth();
        warrior.getDamage(ATTACK);
        int dealedDamage = prevWarHP - warrior.getHealth();
        heal(dealedDamage);
    }

    private void heal(int dealedDamage) {
        int resoredHP = (dealedDamage * VAMPIRISM) / 100;
        if(resoredHP + getHealth() > HP) {
            setHealth(HP);
        }
        else {
            setHealth(getHealth() + resoredHP);
        }
    }


}
