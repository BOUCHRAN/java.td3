public class Vehicule {

    private int nbPassager;

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {

        this.nbPassager = nbPassager;
    }
}