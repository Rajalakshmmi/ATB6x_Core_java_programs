package org.example;

public class IncrementalOperatorExample {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);
        //++a = increment first assign next so value is 11
        //a++ = Assign first increment in next line so value is still 11
        //Above line is crossed so 11+1 it is 12
        //a++ = Assign the value first and increment it next so value is 11
        //output is 11 + 11 + 12  = 34

    }
}
