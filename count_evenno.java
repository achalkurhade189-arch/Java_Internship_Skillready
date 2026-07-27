package Arrays.One_dimension_array;

public class count_evenno {
    public static void main(String[] args) {
        int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        System.out.println("Even numbers : ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.err.println(a[i]);
                count++;
            }
        }
        System.out.println("Count of Even number in an array is "+count);
    }
}
