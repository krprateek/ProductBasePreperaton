package RecursionBasics;

public class EvenNoUsingRecursion {

    public static void main(String[] args) {
        evenNo(10);
    }

    public static void evenNo(int n)
    {

        if(n<0) return;
        evenNo(n-1);
        if(n%2==0)
        {
            System.out.println("Even : " + n);
        }


    }
}
