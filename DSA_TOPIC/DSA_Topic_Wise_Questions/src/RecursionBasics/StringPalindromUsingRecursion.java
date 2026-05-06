package RecursionBasics;

import java.util.Arrays;

public class StringPalindromUsingRecursion {

    public static void main(String[] args) {

        String check = "YAAY";
        char[] ch = check.toCharArray();
        checkPalindrom(ch,0,ch.length-1);
        System.out.println(String.copyValueOf(ch));
        System.out.println(check.equals(String.copyValueOf(ch)));


    }

    public static void checkPalindrom(char [] str, int start, int end )
    {
        if(start>=end) return;

        char temp= str[start];
        str[start] = str[end];
        str[end] = temp;

        checkPalindrom(str, start+1, end-1);

    }
    public static boolean isPalindrome(String s, int left, int right) {
        // base case: 0 or 1 character left → always palindrome
        if (left >= right) return true;

        // mismatch found → not a palindrome
        if (s.charAt(left) != s.charAt(right)) return false;

        // recurse inward
        return isPalindrome(s, left + 1, right - 1);
    }
}
