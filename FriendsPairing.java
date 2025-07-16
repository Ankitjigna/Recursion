import java.util.*;
public class FriendsPairing{
    public static int Pairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int fnm1 = Pairing(n-1);

        //pair
        int fnm2 = Pairing(n-2);
        int pairways = (n-1)*fnm2;

        //total ways
        int totWays = (fnm1 + pairways);
        return totWays;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Pairing(n));
    }
}