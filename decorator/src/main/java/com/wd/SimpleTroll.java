package com.wd;

/**
 * 低配版恶魔
 */
public class SimpleTroll implements Troll{

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void attack() {
        System.out.println("The troll tries to grab you!");
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll runs away!");
    }
}
