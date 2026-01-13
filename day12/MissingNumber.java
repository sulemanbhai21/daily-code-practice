package day12;

public class MissingNumber {

    static int missingNumber(int[] arr)
    {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int total_sum=n*(n+1)/2;

        return total_sum-sum;
    }

    static int missingNumberUsingXOR(int[] arr)
    {
        int xor_all=0;
        int xor_array=0;
        int n=arr.length;

        for(int i=0;i<=n;i++)
        {
            xor_all=xor_all^i;
        }

        for(int i=0;i<n;i++)
        {
            xor_array=xor_array^arr[i];
        }

        return xor_all^xor_array;
    }

    public static void main(String[] args) {
        
        int[] arr={0,1,2,4,5};
        System.out.println("Missing Number:"+missingNumberUsingXOR(arr));

    }
    
}
