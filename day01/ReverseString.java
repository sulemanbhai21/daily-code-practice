package day01;

public class ReverseString {

    String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev += ch;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("GitHub"));
    }
}

