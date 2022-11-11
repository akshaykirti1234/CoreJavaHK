package p2;

import p1.*;

public class Driver {
    public static void main(String[] args) {
        Bus b1 ;

        b1 = new RB();
        b1.breaks(); // executed from Bus , because it is not overridden in RB class

        b1 = new Volvo();
        b1.breaks(); // executed from Volvo , because it is iverridden in Volvo class
    }
}
