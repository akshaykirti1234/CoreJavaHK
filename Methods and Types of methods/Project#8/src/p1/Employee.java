package p1;

public class Employee{
    public int eno;
    public String ename;
    public String dept;
    public double sal;

    public static Employee empClone(Employee e){
        Employee clone = new Employee();

        clone.eno = e.eno;
        clone.ename = e.ename;
        clone.dept = e.dept;
        clone.sal = e.sal;

        return clone;
    }
}