package day05;

import java.util.*;
public class FirstNonRepeatingChar {

    static void firstNonRepeatingChar(String s)
    {
        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(Character c:ch)
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) 
        {
            System.out.println("First Non repeating character: " + entry.getKey());
            return; 
        }
     }
        System.out.println("There is no Non Repeating Character");


    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        firstNonRepeatingChar(s);

        sc.close();
    }
    
}
