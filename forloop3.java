//print the number from 2 to 10 even numbers
package ControlFlow_Statement.Looping_statements;

public class forloop3 {
    public static void main(String[] args) {

        System.out.println("Even numbers : ");
        for(int i = 1;i<=10; i++){
            if(i % 2 == 0)
                System.err.print(i+" ");
        }
    }   
}
