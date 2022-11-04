class Employee{
    int eno;
    String ename;
    String dept;
    double sal;
}

class Company{

    void join(Employee e){
        System.out.println(e.eno);
        System.out.println(e.ename);
        System.out.println(e.dept);
        System.out.println(e.sal);
    }

    void annSal(Employee e){
        System.out.println(e.sal*12);
    }

    void increaseSal(Employee e){
        e.sal = e.sal+(e.sal*20)/100;
    }
}

class Test04{
    public static void main(String[] args) {
        Company c1 = new Company(); //Creating Company class Instance

        Employee e1 = new Employee();//Creating Employee calss Instance

        //Initialising e1 object
        e1.eno = 101;
        e1.ename = "HK";
        e1.dept = "java";
        e1.sal = 2134;

        //invoking join() method 
        c1.join(e1);

        System.out.println();
        //inoking annSal() method
        c1.annSal(e1);

        System.out.println();
        //invoking increaseSal() method
        c1.increaseSal(e1);

        System.out.println(e1.sal);
    }
}