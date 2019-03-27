package com.wd;

/**
 * 愤怒的巨魔
 */
public interface Troll {
    /**
     * 获得攻击能量
     * @return
     */
    int getAttackPower();

    /**
     * 攻击
     */
    void attack();

    /**
     * 逃跑技能
     */
    void fleeBattle();
}
