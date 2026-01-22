package day20;

import java.util.Arrays;

public class ProductItself {

    static int[] productExceptItself(int[] arr)
    {
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];

        left[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            left[i]=left[i-1]*arr[i-1];
        }

        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--)
        {
            right[i]=right[i+1]*arr[i+1];
        }

        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
           
          result[i]=left[i]*right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        
        int[] arr={2,1,3,4};
        int[] result=productExceptItself(arr);
        System.out.println(Arrays.toString(result));

    }
    
}
