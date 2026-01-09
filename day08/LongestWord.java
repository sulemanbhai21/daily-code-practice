package day08;

import java.util.Scanner;

public class LongestWord {

    static String longestWord(String word)
    {
        String[] words=word.split("\\s+");
        String longestword=words[0];

        for(int i=1;i<words.length;i++)
        {
            if(words[i].length()>longestword.length())
            {
                longestword=words[i];
            }
        }
        return longestword;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String word=sc.nextLine();
        System.out.println("Longest Word: "+longestWord(word));


        sc.close();
    }
    
}
