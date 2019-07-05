package builder.entity.pack.impl;

import builder.entity.pack.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "装杯";
    }
}
