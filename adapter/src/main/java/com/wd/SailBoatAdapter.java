package com.wd;

public class SailBoatAdapter implements RowingBoat {

    private SailBoat boat;

    public SailBoatAdapter() {
        boat = new SailBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
