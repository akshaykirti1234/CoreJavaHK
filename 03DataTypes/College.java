class College{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        //Storing the object HK values in s1 insance
        //Initializing s1 instance with HK values
        s1.sno = 101;
        s1.sname = "HK";
        s1.course = "CJ";
        s1.fee = 2500;

        //Storing the object BK values in s2 Instance
        //Initializing s2 instance with BK values
        s2.sno = 102;
        s2.sname = "BK";
        s2.course = "Acting";
        s2.fee = 3500;

        //Displaying s1 object values

        System.out.println("s1 object values");
        System.out.println("s1.sno \t\t: "+s1.sno);
        System.out.println("s1.sname \t: "+s1.sname);
        System.out.println("s1.course\t: "+s1.course);
        System.out.println("s1.fee \t\t: "+s1.fee);

        System.out.println();
        //Dispaying s2 object values

        System.out.println("s2 object values");
        System.out.println("s2.sno \t\t: "+s2.sno);
        System.out.println("s2.sname \t: "+s2.sname);
        System.out.println("s2.course \t: "+s2.course);
        System.out.println("s2.fee \t\t: "+s2.fee);
    }
}