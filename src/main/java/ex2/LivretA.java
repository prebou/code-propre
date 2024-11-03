package ex2;

/**
 * Sous-classe de CompteBancaire
 */
public class LivretA extends CompteBancaire {

    /**
     * Type de compte Livret A
     */
    private static String TYPE = "LA";

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Constructeur de la classe livret A:
     *
     * @param solde
     * @param tauxRemuneration
     */
    public LivretA(double solde, double tauxRemuneration) {

        super(TYPE, solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Debiter un montant au solde
     *
     * @param montant
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant > 0) {
            this.solde = solde - montant;
        } else {
            System.out.println("Découvert n'est pas autorisé sur " + TYPE + "\nSolde insuffisant. ");
        }

    }

    public void appliquerRemuAnnuelle() {

        int pourcentage = 100;
        this.solde = solde + solde * tauxRemuneration / pourcentage;

    }

}
