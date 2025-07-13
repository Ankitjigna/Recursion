import java.util.*;
public class lastOccurance{
    public static int lastOcc(int arr[],int key ,int i){
        if (i==arr.length){
            return -1;
        }
        int isFound = lastOcc(arr ,key ,i+1);
        // if(isFound != -1){
        //     return isFound;
        // }
        // if (arr[i] == key ){
        //     return i;
        // }
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int key =3;
        int arr[] = {1,4,2,5,3,6,8,4,2,4,3};
        System.out.println(lastOcc(arr ,key,0));
    }
}