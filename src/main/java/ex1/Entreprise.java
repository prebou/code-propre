package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Cette Classe represente une entreprise avec ses informations principales.
 *
 * @author Parameswaran
 */

public class Entreprise {
    /**
     * Numéro de Siret de l'entreprise
     */
    public int Siret;

    /**
     * Raison sociale de l'entreprise
     */
    public String Nom;

    /**
     * Adresse de l'entreprise.
     */
    public String adresse;

    /**
     * Date de création de l'entreprise.
     */
    public Date dateCreation;

    /**
     * Capital maximal.
     * */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Constructeur de la classe Entreprise
     *
     * @param Siret Le numéro de Siret de l'entreprise.
     * @param Nom La raison sociale de l'entreprise.
     * @param adresse L'adresse de l'entreprise.
     * @param date_Creation La date de création de l'entreprise
     * */
    public Entreprise(int Siret, String Nom, String adresse, Date date_Creation){
        this.Siret = Siret;
        this.Nom = Nom;
        this.adresse = adresse;
        this.dateCreation = date_Creation;
    }

    /**
     * Afficher les informations de l'entreprise
     * */
    public void afficherStatut() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = formatter.format(dateCreation);
        System.out.println("Entreprise : " + Nom +
                "\nSiret : " + Siret + "\n Adresse : " + adresse +
                "\nDate de création : " + dateString);
    }

    /**
     * Getter
     *
     * @return Siret
     */
    public int getSiret() {
        return Siret;
    }

    /**
     * Getter
     *
     * @return Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * Getter
     *
     * @return adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Getter
     *
     * @return date_Creation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Setter
     *
     * @param Siret
     */
    public void setSiret(int Siret) {
        this.Siret = Siret;
    }

    /**
     * Setter
     *
     * @param Nom
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /**
     * Setter
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Setter
     *
     * @param dateCreation
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
