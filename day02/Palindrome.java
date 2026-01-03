package day02;

public class Palindrome {
    static boolean checkIsPlaindrome(String s)
    {
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while (start<=end) 
        {
            if(ch[start]!=ch[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="madam";
        System.out.println("Plaindrome: "+checkIsPlaindrome(s));
    }
    
}
