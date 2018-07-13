package ass;

/**
 * Created by gadalaya on 7/7/2017.
 */
/**
 * Created by rawlooa on 7/6/2017.
 */
class Fibonacci {
    Fibonacci(int n) {
        int i = 0;

        while (i < n) {
            System.out.println(this.fib(i++));
        }
    }

    private int fib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
class call {
    public static void main (String [] args) {
        Fibonacci f1 = new Fibonacci(5);
    }
}
