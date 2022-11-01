class Test07{
    public static void main(String[] args) {
        A a1 = new A();
        A[] aa = {new A(), new A()};

        System.out.println(a1);
        System.out.println(a1.i1);
        System.out.println(a1.f1);
        System.out.println(a1.bo);
        System.out.println(a1.ch);
        System.out.println(a1.ch[0]);
        System.out.println(a1.ch[1]);
        System.out.println(a1.ch[2]);
        System.out.println(a1.e1.d);
        System.out.println(a1.e1.ch);
        System.out.println(a1.e1.bo);
        System.out.println(a1.e1.la);
        System.out.println(a1.e1.la[0]);
        System.out.println(a1.e1.la[1]);
        System.out.println(a1.e1.s);

        System.out.println();

        System.out.println(aa);
        System.out.println(aa[0].i1);
        System.out.println(aa[0].f1);
        System.out.println(aa[0].bo);
        System.out.println(aa[0].ch);
        System.out.println(aa[0].ch[0]);
        System.out.println(aa[0].ch[1]);
        System.out.println(aa[0].e1.ia);
        System.out.println(aa[0].e1.d);
        System.out.println(aa[0].e1.ch);
        System.out.println(aa[0].e1.bo);
        System.out.println(aa[0].e1.la);
        System.out.println(aa[0].e1.la[0]);
        System.out.println(aa[0].e1.la[1]);
        System.out.println(aa[0].e1.s);

        System.out.println();

        System.out.println(aa);
        System.out.println(aa[1].i1);
        System.out.println(aa[1].bo);
        System.out.println(aa[1].ch);
        System.out.println(aa[1].ch[0]);
        System.out.println(aa[1].ch[1]);
        System.out.println(aa[1].e1.ia);
        System.out.println(aa[1].e1.d);
        System.out.println(aa[1].e1.ch);
        System.out.println(aa[1].e1.bo);
        System.out.println(aa[1].e1.la);
        System.out.println(aa[1].e1.la[0]);
        System.out.println(aa[1].e1.la[1]);
        System.out.println(aa[1].e1.s);
    }
}