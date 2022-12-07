package org.example.Characters;

public class Defender extends Warrior{

    private static final int DEFENCE = 2;
    private static final int ATTACK = 3;

    public Defender() {
        super(60);
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }

    @Override
    public void getDamage(int damage) {
        if(damage > DEFENCE){
            setHealth(getHealth() - (damage - DEFENCE));
        }
    }


}
