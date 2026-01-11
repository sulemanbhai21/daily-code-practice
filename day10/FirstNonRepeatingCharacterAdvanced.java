package day10;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;


public class FirstNonRepeatingCharacterAdvanced {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String sentence=sc.nextLine();

        sentence = sentence.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        boolean found = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}
