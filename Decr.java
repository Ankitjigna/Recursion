import java.util.*;
public class Decr{
    public static void printDecr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecr(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        printDecr(n);
    }
}