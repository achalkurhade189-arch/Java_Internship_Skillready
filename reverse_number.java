package ControlFlow_Statement.Looping_statements;

public class reverse_number {
    public static void main(String[] args) {
        int number = 123456;
        int reverse_number = 0;
        while(number>0){
            int remainder = number % 10;
            reverse_number = reverse_number * 10 + remainder;
            number /= 10;
        }
        System.out.println("reverse number = "+reverse_number);
    }
}
