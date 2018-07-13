package com.p1;
//import com.p2.Arithmatic;
/**
 * Created by gadalaya on 7/6/2017.
 */
public class Arithmatic {
    private double x1, x2;

    Arithmatic(double x, double y) {
        x1 = x;
        x2 = y;
    }

    double add() {
        return 2 * (x1 + x2);
    }
}

class don {
        public static void main(String [] args) {
            com.p2.Arithmatic a = new com.p2.Arithmatic(8, 4);
            a.add();
        }
}
