package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne Moyenne = new CalculMoyenne();

        Moyenne.Ajout(3.00);
        Moyenne.Ajout(5.00);
        Moyenne.Ajout(5.00);

        System.out.println(Moyenne.Calcul());
    }
}
