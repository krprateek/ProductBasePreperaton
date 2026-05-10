package RecursionBasics;

public class PrintFebonaciNoTillN {

    public static void main(String[] args) {

        for(int i=0;i<5;i++) {
            int res = febo(i);
            System.out.println(res + "\t");
        }
    }

    public static int febo(int n){

        if(n==0 || n==1)
        {
            return 1;
        }

        return  febo(n-1) + febo(n-2);


    }
}
