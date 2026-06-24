//print even and odd number from the range 1 to 20
package ControlFlow_Statement.Looping_statements;

public class Whileloop2 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20){
            if(i % 2 == 0)
                System.out.println("Even number = "+i);
            else
                System.out.println("Odd Number = "+i);

            i++;

        }
    }
}
