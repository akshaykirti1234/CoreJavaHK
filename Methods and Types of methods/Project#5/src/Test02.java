import java.util.*;

public class Test02 {

    //add() method
    public static int add(int a , int b) throws IllegalAccessException{
        if(a<=0 || b<=0){
            throw new IllegalAccessException("Error: Please don't pass -ve value");
        }

        int res = a+b;
        return res ;
    }

    //sub() method
    void sub(){
        int a = 10;
        int b = 5;
        int c = a-b;
        System.out.println("Substraction : " +c);
    }

    //mul() method
    int mul(int a, int b){
        int c = a*b;
        return c;
    }

    //div() method
    static int div(int a, int b) throws IllegalAccessException,ArithmeticException {
        if(b==0){
            throw new IllegalAccessException("Error: please don't pass zero as second number");
        }
        if(a<0 || b<0){
            throw new ArithmeticException("Error : Please don't pass -ve values");
        }
        return a/b ;
    }

    //main() method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value :");
        int x = sc.nextInt();
        System.out.print("Enter Second Value :");
        int y = sc.nextInt();

        try{
            //calling add() method
            int aRes = add(x,y);
            System.out.println("Addition : "+aRes);

        }catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }

        System.out.println();// one line gap

        Test02 t1 = new Test02();

        //calling sub() method 
        t1.sub();

        System.out.println();//one line gap

        //calling mul() method 
        int mRes = t1.mul(x,y);
        System.out.println("Multiplication : "+mRes);

        System.out.println();//one line gap

        //calling div() method
        try{
            int rDiv = div(x,y);
            System.out.println("Division : "+rDiv);
        }catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
