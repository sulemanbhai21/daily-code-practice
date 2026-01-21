package day19;


public class BuyAndSell {

    static int bestBuyAndSell(int[] arr)
    {
        if(arr.length==0)
        {
            return 0;
        }

        int minPrice=arr[0];
        int maxProfit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<minPrice)
            {
                minPrice=arr[i];
            }
            else
            {
               int profit=arr[i]-minPrice;
               if(profit>maxProfit)
               {
                 maxProfit=profit;
               }
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        
        int[] arr={7,1,5,3,6,4};
        System.out.println(bestBuyAndSell(arr));
    }
    
}
