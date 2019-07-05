package builder.entity.pack.impl;

import builder.entity.pack.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "打包";
    }
}
