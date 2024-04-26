package org.example;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String args[])
    {

        int a = 100;
        int b = 50;
        System.out.println("Enter the operator do you want to perform");
        Scanner scanner = new Scanner(System.in);
        String get_operator = scanner.next();
        switch (get_operator)
        {
            case "Add" :
            {
                System.out.println("Result of " + a + "+" + b + " is " + (a+b));
                break;
            }
            case "Subtract":
            {
                System.out.println("Result of " + a + "-" + b + " is " + (a-b));
                break;
            }
            case "Multiplication":
            {
                System.out.println("Result of" + a + "*" + b + " is " + (a*b));
                break;
            }
            default :
                System.out.println("Result of" + a + "+" + b + " is " + (a+b));
                break;
        }

    }
}
