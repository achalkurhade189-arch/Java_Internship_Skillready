package ControlFlow_Statement.Looping_statements;

public class PowerOf2 {
    public static void main(String[] args) {
        int base = 2;
        int exp = 5;
        int data = 1;

        while(exp > 0){
            data *= base;
            exp--;
        }
        System.out.println("Power = "+data);
    }
}
