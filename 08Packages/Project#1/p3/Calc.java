package p3;

public class Calc{
    public static void main(String[] args) {
        // Adddtion.add(20,10);
        // Substraction.sub(20,10);
        // Multiplication.mul(20,10);
        // Division.div(20,10);

        //calling methods with Fully Quallified Name (FQN)
        p1.Addition.add(20,10);
        p1.Substraction.sub(20,10);

        //Here method results are not displayed 
        p2.Multiplication.mul(20,10);
        p2.Division.div(20, 10);

        //Here results are results are stored in avariable and then displayed
        int c = p2.Multiplication.mul(20, 10);
        System.out.println("Multiplication : "+ c);
        int d = p2.Division.div(20, 10);
        System.out.println("Division : "+d);

        //We can call a non-void method directly in println() method as argument
        System.out.println("Multiplication : "+ p2.Multiplication.mul(20,10));
        System.out.println("Division : "+ p2.Division.div(20,10));


    }
}