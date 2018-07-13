package ass;

import java.util.Scanner;

/**
 * Created by gadalaya on 7/6/2017.
 */
public class Intdig {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {

            System.out.println(n%10);
            n = n / 10;
        }
    }

}
