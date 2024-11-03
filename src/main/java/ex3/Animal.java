package ex3;

public class Animal {
    private String nomAnimal, typeAnimal, comportement;

    /**
     * constructeur
     * @param nomAnimal
     * @param typeAnimal
     * @param comportement
     * */
    public Animal(String nomAnimal, String typeAnimal, String comportement){
        this.nomAnimal = nomAnimal;
        this.typeAnimal = typeAnimal;
        this.comportement = comportement;
    }

    /**
     * méthode de redefinition pour afficher detail par animal
     *
     * */
    @Override
    public String toString() {
        String animal = "Animal : " + nomAnimal + "\nType : " + typeAnimal + "\nComportement : " + comportement;
        return animal;
    }

    /**
     * Getter
     *
     * @return nomAnimal
     */
    public String getNomAnimal() {
        return nomAnimal;
    }

    /**
     * Getter
     *
     * @return typeAnimal
     */
    public String getTypeAnimal() {
        return typeAnimal;
    }

    /**
     * Getter
     *
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter
     *
     * @param nomAnimal
     */
    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    /**
     * Setter
     *
     * @param typeAnimal
     */
    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    /**
     * Setter
     *
     * @param comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
