class Test{
    public static void main(String[] args) {
        //Primitive variables
        int p = 50;
        int q = m1();

        //referenced variable
        String s1 = "a";
        String s2 = new String("a");

        Example e = new Example();

        System.out.println(p);
        System.out.println(q);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(e.x);
        System.out.println(e.y);
    }

    static int m1(){
        return 60;
    }
}