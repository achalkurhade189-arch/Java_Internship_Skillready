package Arrays.One_dimension_array;

public class Largest_number {
    public static void main(String[] args) {
        int a[] = {23, 56, 21, 78, 35, 89};
        int largest_element = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest_element){
                largest_element = a[i];
            }
        } 
        System.out.println("Largest Element = "+largest_element);
    }
}
