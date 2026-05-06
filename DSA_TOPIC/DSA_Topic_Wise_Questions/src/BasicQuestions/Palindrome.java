package BasicQuestions;

public class Palindrome {
    public static void main(String[] args) {

        int val =101;
        System.out.println(checkPalindrom(val) ? "Palindrome" : "NotPal");
    }
    public static boolean checkPalindrom(int val)
    {
        int halfRev= 0;
        while(val>halfRev)
        {
            halfRev = halfRev*10 + val%10;
            val /= 10;
        }
        return val == halfRev || val == (halfRev / 10);
    }
}
