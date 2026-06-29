package Arrays.SingleDimensinArray;

public class Array_reverse {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        for(int i=0;i< 5;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("Reverse Array : ");
        for(int i=4;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
