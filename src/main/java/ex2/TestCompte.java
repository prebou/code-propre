package ex2;

public class TestCompte {
    public static void main(String[] args) {
        CompteBancaire compteBancaireCC = new CompteBancaire(2550.68, 100);

        CompteBancaire compteBancaireLA = new LivretA(2700.10,10);

        compteBancaireCC.ajouterMontant(150);
        compteBancaireLA.ajouterMontant(150);

        System.out.println("solde du compte de Livret A : " + compteBancaireLA.getSolde() +
                "\nsolde du compte courant : " + compteBancaireCC.getSolde());

        compteBancaireCC.debiterMontant(2760);
        compteBancaireLA.debiterMontant(2800);
    }
}
