package RecursionBasics;

public class PrintStingNtimesBeforeRecursiveCall {

    public static void main(String[] args) {

        print(5);
    }

    public static void print(int n)
    {
        if(n==0) return;

        System.out.print("Hi there" + "\t");

        print(n-1);
    }
}
