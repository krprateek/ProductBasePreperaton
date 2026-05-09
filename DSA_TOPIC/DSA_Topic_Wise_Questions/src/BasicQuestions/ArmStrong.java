package BasicQuestions;

public class ArmStrong {

    public static void main(String[] args) {

        checkArm(153);
    }

    public static void checkArm(int val)
    {
        int sum=0;
               int count = String.valueOf(val).length();
        int tempVal = val;
        while(tempVal>0) {

            sum += (int) Math.pow(tempVal % 10, count);
            tempVal /= 10;
        }


        System.out.println((sum==val) ? "Armstrong" : "NotArmStrong");
    }
}
