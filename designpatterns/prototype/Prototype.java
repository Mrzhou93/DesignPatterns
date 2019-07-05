package prototype;

import java.util.ArrayList;

class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Prototype implements Cloneable{
    private ArrayList list = new ArrayList();

    public A a;

    public Prototype(){
        a = new A();
    }

    public Prototype deepclone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            prototype.a = (A) prototype.a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();

        System.out.println(prototype.a);

        // 浅复制
        Prototype prototypeCopy = prototype.clone();

        System.out.println(prototype == prototypeCopy);
        System.out.println(prototype.a == prototypeCopy.a);

        // 深复制
        Prototype prototypeDeepCopy = prototype.deepclone();
        System.out.println(prototype.a == prototypeDeepCopy.a);
    }
}
