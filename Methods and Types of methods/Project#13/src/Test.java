class Example{
    static int a = 10;
    int x = 20;

    static void m1(){
        System.out.println(a);
        //System.out.println(x);
    }

    void m2(){
        System.out.println(a);
        System.out.println(x);
    }
}

class Test{
    public static void main(String[] args) {
        Example.m1();
        //Example.m2();

        Example e1 = new Example();
        e1.m1();
        e1.m2();
    }
}