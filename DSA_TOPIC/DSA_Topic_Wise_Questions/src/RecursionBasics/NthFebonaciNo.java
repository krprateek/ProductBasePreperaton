package RecursionBasics;

public class NthFebonaciNo {

    public static void main(String[] args) {


        System.out.println(nthFebo(5,0));
    }
    public static int nthFebo(int num, int febNo ){

        if(num == 0 || num ==1)  {

            return 1;
        }

       return nthFebo(num-1,febNo) + nthFebo(num-2, febNo);

    }
}
