public class Student {
    int sno;
    String sname;
    static String institute;

    void setSno(int sno){
        this.sno = sno;
    }
    int getsno(){
        return sno; 
    }

    void setsname(String sname){
        this.sname = sname;
    } 
    String getsname(){
        return sname;
    }

    static void setInstitute(String institute){
        Student.institute  = institute;
    }

    static String getInsitute(){
        return institute;
    }

    void dispaly(){
        System.out.println(" institute :"+institute);
        System.out.println(" sno\t:"+sno);
        System.out.println(" sname\t:"+sname);
    }
}
