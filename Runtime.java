package Arrays.One_dimension_array.Two_DArray;

import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your arrays value are : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
