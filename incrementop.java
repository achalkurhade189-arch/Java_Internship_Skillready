public class incrementop {
    public static void main(String args[])
    {
        int a = 10;
        a++;
        int b = 10;
        b--;

        System.out.println("Value of b = "+b);
        System.out.println("Value of a = "+a);
        System.out.println(a++ + a++); //23

        System.out.println("Value of a = "+a);
        System.out.println(a++ - ++a + --a);

        System.out.println("value of b = "+b);
        System.out.println(b++ + ++b + b--);
    }
}
