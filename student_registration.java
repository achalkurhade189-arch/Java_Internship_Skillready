import java.util.Scanner;

public class student_registration 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** STUDENT REGISTRATION ****");
        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Student Age : ");
        int age = sc.nextInt();
        System.out.println("Enter 12th Percentage : ");
        double percentage = sc.nextDouble();
        System.out.println("Enter Grade : ");
        char grade = sc.next().charAt(0);

        System.out.println("Name =  "+name);
        System.out.println("Age =  "+age);
        System.out.println("Percentage =  "+percentage);
        System.out.println("Grade =  "+grade);
    }
}
