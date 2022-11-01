package p2;

import p1.*;

public class D extends A{
    public static void main(String[] args) {
        
        A a = new A();
        D d = new D();

        // System.out.println(a.a); //a is private . Access within the Class
        // System.out.println(a.b); // b is defult . Access withinthe package
        // System.out.println(a.c); // c is protected , can access by using sub class redefence , i.e : D class
        System.out.println(a.d); // d is public, can access any where

        // System.out.println(d.a);
        // System.out.println(d.b);
        System.out.println(d.c); // c is protected and can accesssable by same subclass class reference . i.e D class 
        System.out.println(d.d);
    }
}