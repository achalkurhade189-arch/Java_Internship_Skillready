package Arrays.SingleDimensinArray;
import java.util.Scanner;

public class ArrayRuntime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        
        System.out.print("Enter 5 numbers for array : ");
        for(int i=0;i< size;i++)
        {
            a[i] = sc.nextInt();
            System.out.print(a[i]+" ");
        }

        int addition = 0;
        for(int i=0;i< size;i++)
        {
            addition += a[i];
        }
        System.out.println("Addition = "+addition);
    }
}
