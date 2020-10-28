package Mike;

public class A3 {
    public static void main(String[] args) {
        String z = " abcdefghijklmnopqrstuvwxyz12345678910111213141516171819202122232425 ";
        String y = "12345678910111213141516171819202122232425abcdefghijklmnopqrstuvwxyz";
        System.out.println(z);
        System.out.println(z.indexOf("z"));
        System.out.println(z.startsWith("z"));
        System.out.println(z.compareTo(y));
        System.out.println(z.trim());
    }
}
