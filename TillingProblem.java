import java.util.*;
public class TillingProblem{
    public static int Tilling(int n){  //( 2 * n) floor
        if (n==0 || n==1){
            return 1;
        }
        
        int fnm1 = Tilling(n-1);
        int fnm2 = Tilling(n-2);
        int totways = (fnm1 + fnm2);
        return totways;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(Tilling(n));
    }
}