package org.example.Characters;

public class Defender extends Warrior{

    private static final int DEFENCE = 2;
    private static final int ATTACK = 3;

    public Defender() {
        super(60);
    }

    @Override
    public void getDamage(Warrior warrior) {
        if(warrior.getAttack() > DEFENCE){
            setHealth(getHealth() - (warrior.getAttack() - DEFENCE));
        }
    }


}
