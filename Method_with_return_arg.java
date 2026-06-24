package Method_Argument;
import java.util.Scanner;

public class Method_with_return_arg {
    static double addition(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value for x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Addition = "+addition(x, y));
    }
}
