public class Maison extends Batiment{
    int nbChambres ;

    public Maison(){
        super();
    }

    public Maison(String adresse , int nbChambres ){
        super(adresse);
        this.nbChambres=nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + this.getNbChambres() +
                " adresse : "+this.getAdresse()+
                '}';
    }
}