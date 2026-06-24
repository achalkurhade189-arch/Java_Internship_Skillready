package Method_Argument;

public class Method_with_arg {
    void addition(int a, int b){
        int c = a + b;
        System.out.println("Addition = "+c);
    }

    public static void main(String[] args) {
        Method_with_arg obj = new Method_with_arg();
        obj.addition(5, 9);
    }
}
