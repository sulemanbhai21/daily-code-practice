package day06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChracters {

    static void duplicateCharacters(String s)
    {
        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(Character c:ch)
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        boolean isduplicate=false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
           if (entry.getValue() > 1) 
           {

                if (!isduplicate) 
                {
                    System.out.println("Duplicate characters:");
                }

               System.out.println(entry.getKey()+"->"+entry.getValue());
               isduplicate=true;
           }
        }

        if(!isduplicate)
        {
            System.out.println("No Duplicate Characters Are Found");
        }
    
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        duplicateCharacters(s);

        sc.close();
        
    }
    
}
