class Student{
    int sno;
    String sname;
    String course;
    double fee;
    String batch;
}

class College{
    void join(Student s){
        System.out.println(s);
        System.out.println();//one line gap
        System.out.println(s.sno);
        System.out.println(s.course);
        System.out.println(s.fee);
        System.out.println(s.batch);
    }

    void changeBatch(Student s){
        s.batch = "11 A.M";
    }
}

class Test03{
    public static void main(String[] args) {
        College c1 = new College();
        
        Student s1 = new Student();

        System.out.println(s1);
        s1.sno = 101;
        s1.sname = "HK";
        s1.course = "CJ";
        s1.batch = "9 A.M";
        s1.fee = 2500;

        c1.join(s1);
        System.out.println();//one line gap
        System.out.println("Current Batch : "+s1.batch);
        c1.changeBatch(s1);
        System.out.println("Changed Batch : "+s1.batch);
    }
}