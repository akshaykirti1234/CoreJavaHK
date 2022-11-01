import java.util.*;

public class Addition {

    static int add(int a, int b) throws Exception {
        if(a<=0 || b<=0){
            throw new Exception("Error: Enter +ve values"); 
        }else{
            int c = a+b;
            return c;
        }
       
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int a= sc.nextInt();

        System.out.print("Enter Second Number :");
        int b = sc.nextInt();

        //Calling add() method
        int x = add(a,b);
        System.out.println("Addition : "+x);
    }
}
