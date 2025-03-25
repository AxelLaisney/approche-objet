package utils;
import java.lang.Integer;

public class TestMethodStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int test = java.lang.Integer.parseInt(chaine);

        int a = 2;
        int b = 4;

        int result = java.lang.Integer.max(a, b);
        System.out.println(result);
    }
}
