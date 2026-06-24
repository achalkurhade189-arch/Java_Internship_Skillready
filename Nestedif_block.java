package ControlFlow_Statement;

public class Nestedif_block {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20;
        int c = 30;

        if(a == 10){
            if(b == 20){
                if(c == 40){
                    System.out.println("All conditions are true ");
                }
                else{
                    System.out.println("c is not equal to 30");
                }
            }
            else
            {
                System.out.println("b is not equal to 20");
            }
        }
        else
        {
            System.out.println("a is not equal to 10");
        }
    }
}
