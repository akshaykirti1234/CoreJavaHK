class Company{
    public static void main(String[] args) {
        Employee e1 = new Employee(); // instance for object HK
        Employee e2 = new Employee(); //instance for object BK

        //Initializing e1 instance with HK object
        e1.eno = 101;
        e1.ename = "Hk";
        e1.sal = 2500;
        e1.dept = "CJ";

        //initializing e2 instance with BK object
        e2.eno = 102;
        e2.ename = "BK";
        e2.sal = 3500;
        e2.dept = "Acting";

        //displaying e1 object values
        System.out.println("======= e1 object values=======");
        System.out.println("e1.eno \t: "+e1.eno);
        System.out.println("e1.ename: "+e1.ename);
        System.out.println("e1.sal \t: "+e1.sal);
        System.out.println("e1.dep \t: "+e1.dept);

        //displaying e2 object values
        System.out.println("======= e2 object values=======");
        System.out.println("e2.no \t: "+e2.eno);
        System.out.println("e2.ename: "+e2.ename);
        System.out.println("e2.sal \t: "+e2.sal);
        System.out.println("e2.dept : "+e2.dept);
    }
}