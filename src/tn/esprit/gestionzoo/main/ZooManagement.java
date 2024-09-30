//
//
//import java.util.Scanner;
//
///**
// *
// * @author houss
// * @author houss
// */
//public class ZooManagement {
//
//
//
//    public static void main(String[] args) {
//        int nbrCages;
//        String zooName;
//        Scanner x=new Scanner(System.in);
//        do{
//            System.out.println("donner nbrCages");
//            nbrCages=x.nextInt() ;}
//        while (nbrCages<0);
//        do{
//            Scanner y=new Scanner(System.in);
//            System.out.println("donner zooName");
//            zooName=y.nextLine() ;
//        }while(!zooName.matches("^[a-zA-Z]*$"));
//        System.out.println(zooName+" comporte "+ nbrCages+" cages");
//
//    }
//}
    package tn.esprit.gestionzoo.main;
    import tn.esprit.gestionzoo.entites.Zoo;
    import tn.esprit.gestionzoo.entites.Animal;

public class ZooManagement {
    public static void main(String[]args){

        Animal lion = new Animal();
        Zoo myZoo = new Zoo("zoo" ,"tunis",20);
        Zoo myZoo2 = new Zoo("zooo","tunissss",23);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        Animal an=new Animal("aaa","bbb",25,true);
        Animal ann=new Animal("ccc","ddd",26,false);
        Animal annn=new Animal("eee","fff",26,false);
        Animal annne=new Animal("eee","fff",26,false);
        myZoo.addAnimal(an);
        myZoo.addAnimal(ann);
        myZoo.addAnimal(annn);
        myZoo.addAnimal(annne);
        myZoo.affiche();

        System.out.println(myZoo.searchAnimal(ann));
        System.out.println(myZoo.searchAnimal(annne));
        System.out.println(myZoo.removeAnimal(annne));
       myZoo.removeAnimal(annne);
        System.out.println(myZoo.isFull());
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
    }

}