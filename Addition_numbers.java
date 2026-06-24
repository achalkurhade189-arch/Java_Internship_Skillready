package ControlFlow_Statement.Looping_statements;

public class Addition_numbers {
    public static void main(String[] args) {
        int i = 1;
        int addition = 0;

        while(i <= 10){
            addition += i;
            System.out.print(i+" ");

            i++;
        }
        System.out.println("\n Addition = "+addition);
    }
}
