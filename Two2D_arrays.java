package Arrays.One_dimension_array.Two_DArray;

public class Two2D_arrays {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows * cols; i++) {
            System.out.print(a[i / cols][i % cols] + " ");

            if ((i + 1) % cols == 0) {
                System.out.println();
            }
        }
    }
}