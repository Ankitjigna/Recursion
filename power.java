import java.util.*;
public class power{
    public static int Pow(int x, int n){


        // if(n==0){
        //     return 1;
        // }
        // int Pnm1= Pow(x,n-1);
        // int Pn = x*Pnm1;
        // return Pn;


        // optimized O(logn) solution



        if(n==0){
            return 1;
        }
        int Power = Pow(x ,n/2);
        int halfPowerSq = (Power * Power);
        if(n%2 != 0){
            halfPowerSq = (x* halfPowerSq);
        }
        return halfPowerSq;


        
    }
    public static void main(String args[]){
        
        System.out.println(Pow(4,2));
    }
}