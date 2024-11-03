package ex3;


import java.util.ArrayList;
import java.util.List;

/**
 * la classe Zoo permet de stocker les animaux dans la liste
 * */
public class Zoo {
    private String nom;
    private List<String> types;
    private List<String> noms;
    private List<String> comportements;
    private List<Animal> animaux = new ArrayList<>();

    public Zoo(String nom) {
        this.nom = nom;
    }

    @Deprecated
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }
    /**
     * methode permet d'ajouter un animal dans la liste animeaux
     * */
    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * methode pour afficher la liste d'animaux en String */
    public void afficherListeAnimaux() {
        for (int i = 0; i < animaux.size(); i++) {
            System.out.println(animaux.get(i).toString());
        }
    }

    /**
     * Getter
     *
     * @return animaux
     */
    public List<Animal> getAnimaux() {
        return animaux;
    }

    /**
     * Getter for nom     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}