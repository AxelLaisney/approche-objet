package fr.diginamic.entities;

public class TestTheater {
    public static void main(String[] args) {
        Theatre theater = new Theatre("My theater", 5);
        System.out.println(theater.Inscrire(2, 10.50));
        System.out.println(theater.Inscrire(2, 10.50));
        System.out.println(theater.Inscrire(2, 10.50));
        System.out.println(theater.Inscrire(2, 10.50));

        System.out.println(theater.Display() );
    }
}
