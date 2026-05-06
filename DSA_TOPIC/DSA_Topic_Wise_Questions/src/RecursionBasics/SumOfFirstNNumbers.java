package RecursionBasics;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        System.out.println(SumOfNNumbers(5));
    }

    public static int SumOfNNumbers(int n){
        if(n<=0)
        {
            return 0;
        }

        return n + SumOfNNumbers(n-1);
    }
}
