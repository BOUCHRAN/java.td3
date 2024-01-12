public class PointNom extends PointEx2 {
    public void setPointNom(int x, int y, char nom) {
        PointEx2(x, y);
        this.nom = nom;}
    public void setNom(char nom) {
        this.nom = nom;}
    public void affCoordNom() {
        System.out.print("Point de nom " + nom + " ");
        affCoord();}
    private char nom;

}