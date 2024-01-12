public class Avion extends Vehicule{
    private int nbMoteur;

    public Avion (int  nbPassager){
        super(nbPassager);
    }

    public Avion(int nbPassager , int nbMoteur){
        super(nbPassager);
        this.nbMoteur=nbMoteur;
    }


    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    public int getNbMoteur() {
        return nbMoteur;
    }
}
