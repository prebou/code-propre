package ex1;
/**
 * cette classe permet de faire les calculs mathématiques suivants :
 * -pour addition -> methode addition(a, b);
 * -pour soustraction -> methode soustraction(a, b);
 * */
public class CalculMaths {

    /**
     * Effectue une addition de deux entiers.
     *
     * @param a  le premier valeur.
     * @param b  le deuxieme valeur.
     * @return la somme des deux valeurs.
     * */
    public static int addition(int a, int b) {
        return a + b;
    }

    /**
     * Effectue une soustraction de deux entiers.
     *
     * @param a  le premier valeur.
     * @param b  le deuxieme valeur.
     * @return la différence entre les deux valeurs.
     * */
    public static int soustraction(int a, int b) {
        return a - b;
    }
}
