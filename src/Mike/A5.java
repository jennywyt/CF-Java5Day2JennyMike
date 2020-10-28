package Mike;

import java.util.Scanner;

public class A5 {
    static void fToC(float f) {
        float resultF = (f-32)* 5/9;
        System.out.println(f + " Fahrenheit are: " + resultF + " Celcius");
    }
    static void cToF(float c) {
        float resultC = (c * 9/5) + 32;
        System.out.println(c + " Celcius are: " + resultC + " Fahrenheit");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Fahrenheit to convert to Celcius: ");
        float a = in.nextFloat();
            fToC(a);

        System.out.println("Enter Celcius to convert to Fahrenheit: ");
        float b = in.nextFloat();
        cToF(b);
    }
}
