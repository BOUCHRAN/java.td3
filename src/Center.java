public class Center extends Point{
    String nom;
    public Center(int x, int y , String nom){
        super(x,y);
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void affNom(){
        System.out.println("nom=" + this.getNom());
    }
}
