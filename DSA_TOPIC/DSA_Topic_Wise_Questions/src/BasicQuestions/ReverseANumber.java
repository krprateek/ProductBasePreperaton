package BasicQuestions;

public class ReverseANumber {
    public static void main(String[] args) {

        int a = 152;
        System.out.println(Reverse(a));
    }

    public static int Reverse(int n)
    {
        int res =0;
        while(n!=0)
        {
            res = res*10 + n%10;
            n /=10;
        }


        return res;
    }


}
