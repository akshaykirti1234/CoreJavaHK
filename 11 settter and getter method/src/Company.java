public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.dispaly();
        System.out.println();

        //set values to e1 object using setter methods

        e1.setEno(101);
        e1.setEname("Akshay");
        e1.setDept("5");
        e1.setSal(500000);

        e1.dispaly();

        e1.setSal(e1.getSal()+e1.getSal()*20/100);
        System.out.println("Updated Sal : "+e1.getSal());
    }
}
