package p3;

import p1.*;
import p2.*;

public class Calc{
    public static void main(String[] args) {
        Addition.add(20, 10);
        Substraction.sub(20, 10);

        System.out.println("Multiplication : "+ Multiplication.mul(20, 10));
        System.out.println("Division : "+ Division.div(20, 10));
    }
}