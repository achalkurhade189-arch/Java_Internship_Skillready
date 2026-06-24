public class FirstMethod {
    void addition(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition = "+c);
    }

    public static void main(String[] args) {
        //call the method
        FirstMethod obj = new FirstMethod();
        obj.addition();
    }
}
