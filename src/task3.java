import java.util.Locale;

public class task3 {
    public static void main(String[] args) {
        String first3= " Snicker ";
        char a = first3.trim().toUpperCase().substring(2,5).charAt(2);
        System.out.println(a);
        String second="Cookie";
        boolean b=second.toLowerCase().replace("o","u").concat("s").startsWith("C");
        System.out.println(b);
    }
}
