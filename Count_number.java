package ControlFlow_Statement.Looping_statements;

public class Count_number {
    public static void main(String args[]){
        int i = 674533241;
        int count = 0;
        while(i>0){
            count++;
            i/=10;
        }
        System.out.println("count number = "+count);
    }
}
