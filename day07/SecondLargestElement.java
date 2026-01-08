package day07;

public class SecondLargestElement {

   static void secondLargest(int[] arr)
   {
     int max=arr[0];
     int smax=Integer.MIN_VALUE;

     if(arr.length <2)
     {
        System.out.println("Array Must have two elements");
        return;
     }



     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]> max)
        {
            smax=max;
            max=arr[i];
        }
        else if(arr[i]>smax  && arr[i]!=max)
        {
            smax=max;
        }
     }
     

     if(smax==Integer.MIN_VALUE)
     {
        System.out.println("There is no second Largest element");
     }
     else
     {
        System.out.println("The second Largest Element: "+smax);
     }
   }

    public static void main(String[] args) {
        
        int[] arr={10,5 ,20 ,8};

        secondLargest(arr);


    }
    
}
