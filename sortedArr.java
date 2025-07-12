import java.util.*;
public class sortedArr{
    public static boolean sortedArray(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
       return sortedArray(arr ,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,27,4,5};
        System.out.print(sortedArray(arr,0));
    }
}