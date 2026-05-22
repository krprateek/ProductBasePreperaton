package Arrays;

public class checkForTheOnDuplicateElemet {

    public static void main(String[] args) {

        findRes(new int[] {4,1,2,1,2});
    }
    //00 11 =0 EXOR of same element is 0 and of different element is 0
    //01 10 =1
    public static void findRes(int[] arr)
    {
        int exor=0;
        for (int val : arr)
        {
            exor ^=val;
        }

        System.out.println(exor);
    }
}
/*
0000
0001
0010
0011
0100
 */