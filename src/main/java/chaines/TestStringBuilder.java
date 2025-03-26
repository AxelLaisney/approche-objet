package chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String test = "";

        long debut = System.currentTimeMillis();

        System.out.println("Stringbuilder");
        for(int i = 1; i < 100001; i++){
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temp écoulé :"+ (fin - debut));

        System.out.println("String");
        debut = System.currentTimeMillis();

        for (int i = 1; i < 100001; i++){
            test += i;
        }

        fin = System.currentTimeMillis();
        System.out.println("Temp écoulé :"+ (fin - debut));
    }
}
