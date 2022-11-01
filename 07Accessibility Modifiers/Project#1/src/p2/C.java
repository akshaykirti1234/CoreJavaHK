package p2;

import p1.A;

class C extends A{
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        A ob = new C();

        // System.out.println(a.a);
        // System.out.println(a.b);
        // System.out.println(a.c);
        System.out.println(a.d);
        
        // System.out.println(c.a);
        // System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);

        // System.out.println(ob.a);
        // System.out.println(ob.b);
        // System.out.println(ob.c);
        System.out.println(ob.d);
    }
}