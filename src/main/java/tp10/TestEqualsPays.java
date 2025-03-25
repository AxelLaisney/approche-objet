package tp10;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays pays1 = new Pays("fr", 500);
        Pays pays2 = new Pays("fr", 500);
        Pays pays3 = new Pays("en", 100);

        System.out.println("Using equals: " + pays1.equals(pays2));
        System.out.println("Using equals: " + pays1.equals(pays3));
        System.out.println("Using == : " + (pays1 == pays2));
        System.out.println("Using == : " + (pays1 == pays3));
    }
}
