package BasicQuestions;

public class GCDof2No {

    public static void main(String[] args) {

        System.out.println(checkGCD(48,18));
    }

    public static int checkGCD(int a, int b)
    {
        int temp=0;
        while(b!=0)
        {
            temp =b;
            b= a % b;
            a = temp;
        }

        return temp;
    }

    /* with recursion
    public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}*/
}
