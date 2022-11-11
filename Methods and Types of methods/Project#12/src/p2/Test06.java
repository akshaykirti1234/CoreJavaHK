package p2;

import p1.*;

public class Test06{
    public static void main(String[] args) {
        Example e1 = new Example();
        e1.m1(); // Search in Example class, and Executed from Example class
        e1.m2(); // Search in Example class, and Executed from Example object
        e1.m3(); // Search in Example class, and Executed from Example object
        //e1.m4();//Error (not found in Example class )
        System.out.println();
        
        Sample s1 = new Sample();
        s1.m1(); // Search in Sample class, executed in Sample Class
        s1.m2(); // Search in Sample class, executed from Sample object
        s1.m3(); // m3 is not available in Sample class , thats way compiler search m3 in Super class ,and executed in Super class
        //s1.m4; // Error
        System.out.println();

        Example e2 = new Sample();
        e2.m1(); // Search in Example class, executed from Example Class
        e2.m2(); // Search in Example class, executed from Sample object
        e2.m3(); // Search in Example class, executed from Example object
        //e2.m4(); // Error (not found in Example class, even can not go to sub class(Sample) for execution)

    }
}