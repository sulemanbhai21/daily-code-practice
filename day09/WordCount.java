package day09;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class WordCount {

    static void wordCount(String s)
    {
        String[] words=s.toLowerCase().split("\\s+");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String word:words)
        {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        wordCount(s);

        sc.close();
    }
    
}
