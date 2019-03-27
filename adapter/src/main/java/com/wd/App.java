package com.wd;

/**
 * 适配器模式
 */
public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new SailBoatAdapter());
        captain.row();
    }
}
