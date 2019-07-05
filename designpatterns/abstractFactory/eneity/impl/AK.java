package abstractFactory.eneity.impl;

import abstractFactory.eneity.GUN;

public class AK implements GUN {

    @Override
    public void shoot() {
        System.out.println("shoot with AK");
    }
}
