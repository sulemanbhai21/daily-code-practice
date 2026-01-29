package day24;

import java.util.Arrays;

public class RotateArray {

    static void rotateArray(int[] arr,int start,int end)
    {
        
        while (start<end) 
        {
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--; 
        }
    }

    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int start=0;
        int end=arr.length;
        k=k%end;
        rotateArray(arr,start, end-1);
        rotateArray(arr, start, k-1);
        rotateArray(arr, k, end-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
