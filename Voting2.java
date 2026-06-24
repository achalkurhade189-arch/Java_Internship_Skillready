package ControlFlow_Statement;

import java.util.Scanner;

public class Voting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ente your Country : ");
        String country = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(country.equals("India") && age > 18 ){
            System.out.println("You are eligible for voting ");
        }
        else{
            System.out.println("Not eligible because country and age don't match");
        }
    }
}
