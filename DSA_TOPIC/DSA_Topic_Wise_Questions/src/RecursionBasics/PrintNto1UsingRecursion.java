package RecursionBasics;

public class PrintNto1UsingRecursion {

    public static void main(String[] args) {
        PrintNto1(5);
    }

    public static void PrintNto1(int n)
    {
        if(n>0)
        {
            System.out.print(n + "\t");
            PrintNto1(n -1);
        }
    }
}
