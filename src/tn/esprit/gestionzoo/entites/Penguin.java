package tn.esprit.gestionzoo.entites;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin() {}
    public Penguin(String family,String  name,int age,boolean isMammal,String habitat ,float swimmingDepth) {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;

    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
