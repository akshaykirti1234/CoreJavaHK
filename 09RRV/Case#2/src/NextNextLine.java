/* next() and nextLine() combination */

import java.util.Scanner;

public class NextNextLine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.next();

        System.out.print("Enter course : ");
        String course = sc.nextLine();

        //Display result
        // System.out.println();

        System.out.println("Name :"+name);
        System.out.println("Course :"+course);
    }
}