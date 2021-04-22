package Methods;

import java.util.Locale;

public class Practise1 {
    public static void main(String[] args) {
        String str = "Payment $100 paid";
        System.out.println(str.charAt(8));
        String str1 = "Payments $100 paid";
        System.out.println(str.indexOf("$"));
        System.out.println(str.substring(8));
    }
}
