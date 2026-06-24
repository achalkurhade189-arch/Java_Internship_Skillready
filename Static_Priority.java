public class Static_Priority {
    static{
        System.out.println("Static block");
    }
    public static void main(String args[]){
        System.out.println("Main method block ");
    }
    static{
        System.out.println("Second static block ");
    }
}
