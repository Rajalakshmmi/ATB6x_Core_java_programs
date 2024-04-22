package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        int x, y, z;
        z = 10;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        double square_of_x = Math.pow(x,2);
        y = scanner.nextInt();
        double square_of_y = Math.pow(y,2);
        System.out.println(square_of_x);
        System.out.println(square_of_y);
        Double result = Math.sqrt(x + y);
        System.out.println(result);
    }

}
