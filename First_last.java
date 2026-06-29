package Arrays.SingleDimensinArray;

public class First_last{
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("First element : "+a[0]);
        System.out.println("Last element : "+a[a.length-1]);
        System.out.println("Average : "+(a.length/2+1));
    }
}