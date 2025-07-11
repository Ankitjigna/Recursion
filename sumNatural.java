import java.util.*;
public class sumNatural{
    public static int sumNaturalnum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = sumNaturalnum(n-1);
        int sum = n+sumNaturalnum(n-1);
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(sumNaturalnum(n));
    }

}