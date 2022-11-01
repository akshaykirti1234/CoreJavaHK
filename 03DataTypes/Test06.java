class Test06{
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println(s1);
        System.out.println(s1.f1);
        System.out.println(s1.ch);
        System.out.println(s1.ch[0]);
        System.out.println(s1.ch[1]);
        System.out.println(s1.s);
    }    
}
class Sample{
    float f1 = 53.2f;
    char[] ch = {'H','K'};
    String s = "NiT";
}