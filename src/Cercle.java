
public class Cercle extends Center {
    int r;
    public Cercle(int x,int y, String nom ,int r){
        super(x,y,nom);
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void affichperimetre(){
        System.out.println("le perimetre =" + this.getR());


    }


}