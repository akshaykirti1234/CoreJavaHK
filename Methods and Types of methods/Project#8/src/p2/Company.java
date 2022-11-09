package p2;

import p1.Employee;

public class Company {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.eno = 101;
        e1.ename = "Hari";
        e1.dept = "CJ";
        e1.sal = 1000000;

        Employee e2 = Employee.empClone(e1);

        System.out.println(e1 == e2);
        System.out.println();
        System.out.println("e1 object and e2 object data");
        System.out.println(" "+e1.eno+"\t\t"+e2.eno);
        System.out.println(" "+e1.ename+"\t\t"+e2.ename);
        System.out.println(" "+e1.dept+"\t\t"+e2.dept);
        System.out.println(" "+e1.sal+"\t"+e2.sal);

        //changing clone object data
        e2.ename = "BK";
        e2.sal = 20000;

        System.out.println();
        System.out.println("e1 object and e2 object data");
        System.out.println(" "+e1.eno+"\t\t"+e2.eno);
        System.out.println(" "+e1.ename+"\t\t"+e2.ename);
        System.out.println(" "+e1.dept+"\t\t"+e2.dept);
        System.out.println(" "+e1.sal+"\t"+e2.sal);

    }
}
