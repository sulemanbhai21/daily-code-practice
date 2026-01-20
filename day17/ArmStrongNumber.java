package day17;

import java.util.Scanner;

public class ArmStrongNumber {

    static int armStrong(int num)
    {
        int sum=0;
        while (num!=0) {
        int digit=num%10;
        sum+=digit*digit*digit;
        num/=10;
        
    }
    return sum;
}


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(armStrong(i)==i)
            {
              System.out.print(i+" ");
            }
        }


        sc.close();
        
              
    

    }
    
}
