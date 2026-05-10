package RecursionBasics;

public class powerOfANumber {

    public static void main(String[] args) {

        System.out.println(driveValue(2,5));
    }

    public static int driveValue(int val, int pow)
    {

        if(pow==1) return val;
        return  val * driveValue(val,pow-1);
    }
}
