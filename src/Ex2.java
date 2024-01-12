
public class Ex2 {
    public static void main(String[] args) {
        PointEx2 a = new PointEx2();

        a.PointEx2(2, 5);
        a.affCoord();
        PointNom b = new PointNom();
        b.setPointNom(1, 7, 'A');
        b.affCoordNom();
        b.deplace(9, 3);
        b.affCoordNom();
    }


}