package tp09;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] formes = new ObjetGeometrique[2];
        formes[0] = new Cercle(5);
        formes[1] = new Rectangle(4,5);

        for(ObjetGeometrique f: formes){
            System.out.println("Perimetre :"+f.perimetre());
            System.out.println("Surface :"+f.surface());
        }
    }
}
