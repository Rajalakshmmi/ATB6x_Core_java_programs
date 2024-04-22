package org.example;

import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        // Finding max between 3 numbers using ternary operator
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  //30
        int b = scanner.nextInt();  //10
        int c = scanner.nextInt();  //20
        System.out.println("The numbers are" + a + "B values is" + b + "C value is" + c);
        int result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The Max number is " + result);
    }
}

