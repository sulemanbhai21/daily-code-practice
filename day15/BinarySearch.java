package day15;

public class BinarySearch {

    static int binarySearch(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;

        while (low<=high) {

            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target <arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return-1;


        
    }

    public static void main(String[] args) {
        
        int[] arr={1,3,5,7,9,11};
        int target=5;

        System.out.println(binarySearch(arr, target));

    }
    
}
