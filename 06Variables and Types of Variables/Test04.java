class Test04{
    public static void main(String[] args) {
        int i = 10;
        Example e = new Example();
        System.out.println("i : "+i);
        System.out.println("e : "+e);

        int i1 = 10;
        int i2 = 20;
        int i3 = i1+i2;
        System.out.println("i3 : "+i3);

        Example e1 = new Example();
        Example e2 = new Example();
        //Example e3 = e1+e2;

        System.out.println("e1 : "+e1);
        System.out.println("e2 : "+e2);

        String s1 = "hari";
        String s2 = "NiT";
        String s3 = s1+s2;
        //String s4 = s1-s2;
        //String s4 = s1*s2;
        //String s4 = s1/s2;
        //String s4 = s1%s2;

        System.out.println("s3 : "+s3);

    }
}