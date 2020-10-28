package Mike;

import java.util.Scanner;

public class A7 {
    static void average(double a, double b, double c) {
        double result = (a+b+c)/3;
        System.out.println("The average is: " + result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double a = in.nextDouble();
        System.out.println("Enter 2nd number: ");
        double b = in.nextDouble();
        System.out.println("Enter 3rd number: ");
        double c = in.nextDouble();

        average(a, b, c);
    }
}
