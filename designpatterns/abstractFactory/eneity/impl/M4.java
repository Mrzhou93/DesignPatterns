package abstractFactory.eneity.impl;

import abstractFactory.eneity.GUN;

public class M4 implements GUN {
    @Override
    public void shoot() {
        System.out.println("shot with M4");
    }
}
