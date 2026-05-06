package RecursionBasics;

public class PrintNameRecursivelyKTimes {

    public static void main(String[] args) {

        printName(5);
    }

    public static void printName(int n){
        if(n>0)
        {
            System.out.println("Hi Prateek");
            printName(n-1);
        }

    }
}
