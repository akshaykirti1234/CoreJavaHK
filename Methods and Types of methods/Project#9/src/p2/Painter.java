package p2;

import java.util.Scanner;
import p1.*;

public class Painter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s1 = new Rectangle();

        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter breath : ");
        int b = sc.nextInt();

        s1.findArea(l,b);

    }
}
