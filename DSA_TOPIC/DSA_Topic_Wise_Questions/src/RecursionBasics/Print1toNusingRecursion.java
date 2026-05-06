package RecursionBasics;

public class Print1toNusingRecursion {

    public static void main(String[] args) {
        Print1toN(5,1);
    }

    public static void Print1toN(int n,int k)
    {
        if(n>=k)
        {
            System.out.println(k);
            Print1toN(n,k+1);
        }
    }
}
