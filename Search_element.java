package Arrays.One_dimension_array;
import java.util.*;
public class Search_element {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search element : ");
        int search_value = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]== search_value)
            {
                j= 1;
                break;
            }
        }
        if(j==1){
            System.err.println("Number is available ");
        }
        else{
            System.out.println("Number is not available ");
        }

    }
}
