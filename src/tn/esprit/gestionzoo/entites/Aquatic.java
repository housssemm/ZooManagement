package tn.esprit.gestionzoo.entites;

import java.net.SocketTimeoutException;

public class Aquatic extends Animal{
    private String habitat;
    public Aquatic() {}
    public Aquatic(String family,String  name,int age,boolean isMammal,String habitat) {
        super(family,name,age,isMammal);
        this.habitat = habitat;

    }

    @Override
    public String toString() {
        super.toString();
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming. ");
    }

}
