package Arrays;

public class MaxConseutiveOnes {

    public static void main(String[] args) {
        findConsecutiveOne(new int[]{1,1,1,0,0,1,1});
    }
    //1,1,0,0,1,1,1
    public static  void findConsecutiveOne(int[] arr)
    {

        int count=0;
        int maxCount=0;
        for (int k : arr) {
            if (k == 1) {
                count++;
            } else {
                count = 0;
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);

    }
}
