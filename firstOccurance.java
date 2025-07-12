import java.util.*;
public class firstOccurance{
    public static int firstOcc(int arr[] ,int key ,int i){
        if(i==arr.length){
            return -1;
        }
        if (key == arr[i]){
            return i;
        }
        return firstOcc(arr,key ,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,3,7,8,9,2};
        int key = 7;
        System.out.println(firstOcc(arr,key,0));
    }
}