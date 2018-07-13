package com.p2;

import java.util.Scanner;

/**
 * Created by gadalaya on 7/6/2017.
 */
public class Arithmatic {
  private double x1, x2;
   public Arithmatic(double x, double y) {
        x1 = x;
        x2 = y;
    }
   public double add() {
        return x1 + x2;
    }
    double mul() {
        return x1 * x2;
    }
    double sub() {
        return x1 - x2;
    }
    double div() {
        return x1 / x2;
    }
}
class Call {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Arithmatic obj1 = new Arithmatic(sc.nextInt(), sc.nextInt());
        System.out.print(""+obj1.add() +" "+ obj1.mul()+" " + obj1.sub()+" " + obj1.div());
    }
    void hello() {
        System.out.print("Hello");
    }
}