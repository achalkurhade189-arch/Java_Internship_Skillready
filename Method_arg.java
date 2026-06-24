//Method without arguments
package Method_Argument;

public class Method_arg {
    void addition(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition = "+c);
    }
    public static void main(String args[]){
        Method_arg obj = new Method_arg();
        obj.addition();
    }
}
