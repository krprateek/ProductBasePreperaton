package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        doSelectionSort(new int[]{1,5,6,7,9,2,3});
    }

    public static void doSelectionSort(int[] ar){

        int minIndex=0;

        for (int i=0;i<ar.length-1;i++)
        {
          minIndex=i;
            for (int j=i+1;j<ar.length;j++)
            {
                if(ar[minIndex]>ar[j])
                {
                    minIndex = j;
                 }
            }
            int temp = ar[minIndex];
            ar[minIndex] = ar[i];
            ar[i] = temp;
        }

        for(int i : ar)
        {
            System.out.print(i + "\t");
        }

    }
}
