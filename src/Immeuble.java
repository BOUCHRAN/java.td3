public class Immeuble extends Batiment {
    int nbAppart ;

    public Immeuble(){
        super();
    }

    public Immeuble(String adresse , int nbAppart ){
        super(adresse);
        this.nbAppart=nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + this.getNbAppart() +
                " adresse : "+this.getAdresse()+
                '}';
    }
}
