package ControlFlow_Statement.Looping_statements;

public class nested_dowhile {

    public static void main(String[] args) {
        int a = 1;
        do{
            int j = 1;
            do{
                System.out.println(a+" "+j);
                j++;
            }while(j <=3);

            a++;
        }while(a<=3);
    }
}
