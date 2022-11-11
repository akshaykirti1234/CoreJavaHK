package p2;

import p1.*;

public class Test06{
    public static void main(String[] args) {
        Example e1 = new Example();
        e1.m1();
        e1.m2();
        System.out.println();
        
        Sample s1 = new Sample();
        s1.m1();
        s1.m2();
        System.out.println();

        Example e2 = new Sample();
        e2.m1();
        e2.m2();

    }
}