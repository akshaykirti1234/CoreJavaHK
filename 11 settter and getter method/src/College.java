public class College {
    public static void main(String[] args) {
        Student.setInstitute("Naresh i T");
        Student s1 = new Student();
        System.out.println("s1 object initial values");
        s1.dispaly();

        //initializing s1 fields
        s1.setSno(101);
        s1.setsname("HK");

        System.out.println("\ns1 values after initialization");
        s1.dispaly();

        System.out.println("\ns1 values by using getter methods");
        System.out.println("institute :\t"+ s1.getInsitute());
        System.out.println("sno :\t\t"+ s1.getsno());
        System.out.println("sname :\t"+ s1.getsname());

        String sname = s1.getsname();
        System.out.println(sname.toLowerCase());
    }
}
