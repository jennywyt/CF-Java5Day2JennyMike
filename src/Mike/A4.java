package Mike;
import java.util.*;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String a = in.nextLine();
        System.out.println("You entered: " + a);

        System.out.println("Enter last name: ");
        String b = in.nextLine();
        System.out.println("You entered: " + b);

        char aa = a.charAt(0);
        char bb = b.charAt(0);
        String aaa = String.valueOf(aa);
        String bbb = String.valueOf(bb);

        String c = aaa.concat(bbb);

        System.out.print(c.toUpperCase());
    }
}
