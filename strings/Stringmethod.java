package strings;

public class Stringmethod {
    public static void main(String[] args) {
        String name="Deepak";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toCharArray());
        System.out.println(name.startsWith("Dee"));
        System.out.println(name.endsWith("ak"));
        System.out.println(name.trim());
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(String.valueOf(10));
        System.out.println(name.replace("D", "p"));
    }
}
