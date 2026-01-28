package day23;

public class UniqueElement {

    static int uniqueElement(int[] arr)
    {
        // using this method 
        // step-1 elements should be only twice not more than 2
        //step-2 there is no more than 1 unique element
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        
        int[] arr={4,1,2,1,2};
        System.out.println(uniqueElement(arr));
    }
    
}
