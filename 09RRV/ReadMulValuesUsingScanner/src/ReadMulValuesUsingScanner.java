/* Enter multiple values at a time like in cmd application
 and read each value separately by using Scanner */

import java.util.Scanner;

public class ReadMulValuesUsingScanner{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter nums: ");
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        int c = scn.nextInt(); 
        
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
    }
}