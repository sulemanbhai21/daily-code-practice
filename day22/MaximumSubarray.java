package day22;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {

    static List<Integer> maximumSubarray(int[] arr)
    {
        int n=arr.length;
        int currentSum=arr[0];
        int maximumSum=arr[0];
        int start=0;
        int end=0;
        int s=0;

        for(int i=1;i<n;i++)
        {
            if(arr[i]> (currentSum+arr[i]))
            {
                currentSum=arr[i];
                s=i;
            }
            else
            {
                currentSum=currentSum+arr[i];
            }

            if(currentSum>maximumSum)
            {
                maximumSum=currentSum;
                start=s;
                end=i;
            }
        }
        List<Integer> result=new ArrayList<>();
        if(maximumSum<0)
        {
            return result;
        }
        for(int i=start;i<=end;i++)
        {
            result.add(arr[i]);    
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        List<Integer> result=maximumSubarray(arr);
        System.out.println(result);
    }
    
}
