/* Read one number and read one String from the keyboard */

import java.util.Scanner;

public class ReadNumName{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = s.nextInt();
        s.nextLine();
        System.out.print("Enter String : ");
        String name = s.nextLine();

        System.out.println("\nYou enterd\nNum\t: "+num+"\nName\t: "+name);
    }
}