/* nextLine() and next() combination */

import java.util.*;

public class NextLineNext{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = scn.nextLine();

        System.out.print("Enter Course : ");
        String course = scn.next();

        //Displaying results

        System.out.println("name: "+name);
        System.out.println("Course: "+course);
    }
}