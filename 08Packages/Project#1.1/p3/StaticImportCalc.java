package p3;

import static p1.Addition.*;
import static p1.Substraction.*;
import static p2.Multiplication.*;
import static p2.Division.*;

public class StaticImportCalc {

    public static void main(String[] args) {
        add(10,20);
        sub(20,10);
        System.out.println("Multiplication : "+mul(20,10));
        System.out.println("Division : "+div(20,10));
    }
    
}