package    tn.esprit.gestionzoo.entites;
public class Zoo {
    Animal [] animal;
    String name;
    String city ;
    static final int nbrCages=25;
    public Zoo() {}
    public Zoo(String name, String city, int nbrCages ) {

        this.name = name;
        this.city = city;
        this.animal = new Animal[nbrCages];
//        this.nbrCages = nbrCages;

    }
    public void displayZoo(){
        System.out.println("zoo : "+this.name +" city: " +this.city + "nbCages:  "+this.nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo : " + name +"city: "+city+ ", Number of cages: " + nbrCages;
    }

    boolean addAnimal(Animal an){
        if (isFull()){
            return false;
        }else{
        for (int i=0;i<animal.length;i++){
//            if (an.age<0 && !an.name.matches(" ")){
//                return false;
//            }

            if(animal[i]==null ){

            animal[i]=an;
                break;
        }}
        return true;

    }}
//boolean addAnimal(Animal an){
//    for (int i=0;i<animal.length;i++){
//        if(searchAnimal(an)!=-1&&animal[i]==null){
//            return false;
//        }else{
//            animal[i]=an;
//            break;
//        }}
//    return true;
//}
    public void affiche(){
        for (int i=0;i<animal.length;i++){
            if (animal[i]!=null) {
                System.out.println(animal[i]);
            }
        }
    }

    int searchAnimal(Animal animale){
        for (int i=0;i<animal.length;i++){
            if (animal[i]!=null && animal[i].getName()==animale.getName()){
                return i;
            }

        }
        return -1;
    }
    boolean removeAnimal(Animal an){
        if (searchAnimal(an)==-1){
            return false;
        }
//        else(animal.remove[searchAnimal(animal)])
        else{animal[searchAnimal(an)]=null;}
        return true;
    }
    boolean isFull(){
        if (animal.length==nbrCages){
            return true;
        }
        return false;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.animal.length>z2.animal.length){
            return z1;
        }
        return z2;
    }
}
