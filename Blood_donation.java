package ControlFlow_Statement;

import java.util.Scanner;

public class Blood_donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        System.out.print("Enter Disease (yes/no): ");
        String disease = sc.nextLine();

        System.out.print("Enter Weight : ");
        int weight = sc.nextInt();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if(gender.equals("male")){
            if(weight >= 60){
                if(age >= 18){
                    if(disease.equals("no")){
                        System.out.println("eligible for blood donation");
                    }
                    else{
                        System.out.println("Not eligible due to disease");
                    }
                }
                else{
                    System.out.println("Not eligible : age must be 18 or above ");
                }
            }
            else{
                System.out.println("Not eligible : weight must be 60 or above ");
            }
        }
        else if(gender.equals("female")){
            if(weight >= 50){
                if(age >= 18){
                    if(disease.equals("no")){
                        System.out.println("eligible for blood donation");
                    }
                    else{
                        System.out.println("Not eligible due to disease");
                    }
                }
                else{
                    System.out.println("Not eligible : age must be 18 or above ");
                }
            }
            else{
                System.out.println("Not eligible : weight must be 50 or above ");
            }
        }
        else{
            System.out.println("Invalid Gender entered ");
        }
    }
}
