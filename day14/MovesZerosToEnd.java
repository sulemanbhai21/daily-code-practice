package day14;


import java.util.Arrays;

public class MovesZerosToEnd {

    static void movesZerosToEnd(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
         
        int[] arr={1,0,0,3,0,6,0,12};
        movesZerosToEnd(arr);
    }
    
}
