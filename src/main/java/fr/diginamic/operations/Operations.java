package fr.diginamic.operations;

public class Operations {
    public static double calcul(double a, double b, char op){
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '/' -> a / b;
            case '*' -> a * b;
            default -> 0;
        };
    }
}
