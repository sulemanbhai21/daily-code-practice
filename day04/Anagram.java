package day04;

import java.util.*;

public class Anagram {

    static boolean checkAnagram(String s1,String s2)
    {
        s1.toLowerCase(); // convert all characters into lowercase
        s2.toLowerCase();

        char[] c1=s1.toCharArray(); // convert to char array
        char[] c2=s2.toCharArray();

        Arrays.sort(c1); // sort the char Array
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2))
        {
            return true;
        }

        return false;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String s1");
        String s1=sc.nextLine();
        System.out.println("Enter a String s2");
        String s2=sc.nextLine();

        if(checkAnagram(s1, s2))
        {
            System.out.println("Two Strings are Anagram");
        }
        else
        {
            System.out.println("Two Strings are not Anagram");
        }

        sc.close();
    }
    
}
