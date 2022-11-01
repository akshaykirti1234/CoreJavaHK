import java.util.Scanner;

public class Addition{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Fno : ");
        int a = scn.nextInt();
        System.out.print("Enter Sno : ");
        int b = scn.nextInt();

        int c = a+b;
        System.out.println("Addition : "+c);
    }
}