public class Employee {
    private int eno;
    private String ename;
    private String dept;
    private double sal;

    //setter and getter methods

    void setEno(int eno){
        this.eno = eno;
    }
    int getEno(){
        return eno;
    }

    void setEname(String ename){
        this.ename = ename;
    }
    String getEname(){
        return ename;
    }

    void setDept(String dept){
        this.dept = dept;
    }
    String getDept(){
        return dept;
    }

    void setSal(double sal){
        this.sal = sal;
    }
    double getSal(){
        return sal;
    }

    //dispaly() method

    void dispaly(){
        System.out.println("eno\t:"+eno);
        System.out.println("ename\t:"+ename);
        System.out.println("sal\t:"+sal);
    }
}
