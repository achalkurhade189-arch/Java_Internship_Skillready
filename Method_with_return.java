package Method_Argument;

public class Method_with_return {
    int addition(){
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Method_with_return obj = new Method_with_return();
        System.out.println("Addition = "+obj.addition());
    }
}
