package RecursionBasics;

public class FibonacciiNumber {
    public static void main(String[] args) {


        for(int i=0; i<4 ;i++) {
            System.out.print(checkFibonnacci(i) + "\t");
        }
    }

    public static int checkFibonnacci(int val)
    {
        if(val<=1)
        {
            return val;
        }


        return checkFibonnacci(val-1) + checkFibonnacci(val-2);
    }
}
