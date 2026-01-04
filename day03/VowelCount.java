package day03;

import java.util.Scanner;
public class VowelCount {
    static int countVowels(String s)
    {
      s=s.toLowerCase();
      int count=0;
      for(int i=0;i<s.length();i++)
      {
         char ch =s.charAt(i);
        if("aeiou".contains(String.valueOf(ch)))
        {
            count++;
        }
      }
      return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(countVowels(s));

        sc.close();

    }
    
}
