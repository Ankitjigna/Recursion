import java.util.*;
public class fibonici{
    public static int printFib(int n){
        if (n == 0 || n == 1){
            return n;
        }
       
        int Fnm1 = printFib(n-1);
        int Fnm2 = printFib(n-2);
        int fib = (Fnm1 + Fnm2);
        return fib;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.print(printFib(n));
    }
}