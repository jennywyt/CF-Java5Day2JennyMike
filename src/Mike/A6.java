package Mike;

import java.util.Scanner;

public class A6 {
    static void circle(double r) {
        double resulta = Math.PI * (r*r);
        System.out.println("The area is: " + resulta);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle which area you want to calculate: ");
        double a = in.nextDouble();
        circle(a);
    }
}
