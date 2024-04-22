package org.example;

public class DecrementOperatorExample {
    public static void main(String[] args) {
        int b = 20;
        //--b = decrement first so value of b is                    = 19
        // b++ = Assign first increment after hence value is still  = 19
        // Above line is crossed hence now value of b is 20
        // ++b increment first and assign hence ++b is 21 now       = 21
        // value is 19 + 19 + 21 = 79
        System.out.println(--b + b++ + ++b);

    }

}
