
public class Model {

    private Personnage[] tabPerso;
    private Plateau plateau;

    public Model() {
        tabPerso=new Personnage[1];
        tabPerso[0]=new Personnage(100,100);
        plateau=new Plateau();
    }

    public Personnage[] getTabPerso() {
        return tabPerso;
    }

    public Plateau getPlateau() {
        return plateau;
    }


}
