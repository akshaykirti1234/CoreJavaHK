class Test05_Class{
    public static void main(String[] args) {
        Example e1 = new Example();
        System.out.println(e1.ia);
        System.out.println(e1.d);
        System.out.println(e1.ch);
        System.out.println(e1.bo);
        System.out.println(e1.la); // [J@27716f4
        System.out.println(e1.la[0]); // 8
        System.out.println(e1.la[1]);// 9
        System.out.println(e1.s);
    }
}
//to store and read
class Example{ //user difined datatype
    int ia = 10;
    double d = 20.5;
    char ch = 'a';
    boolean bo = true;
    long[] la = {8,9};
    String s = "hari";
}