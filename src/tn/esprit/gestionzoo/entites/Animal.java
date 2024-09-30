package    tn.esprit.gestionzoo.entites;

public class Animal {
    String family ;
    private String name;
    private int age;
    boolean isMammal;
    public Animal() {}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "family : " + family +"name: "+name+ ", age: " + age +"isMammal : "+isMammal;
    }


    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("name is empty");
        }
        else {
            this.name = name;
        }
    }
    public  void  setAge(int age){
        if(age<0){
            System.out.println("Age can't be negative");
        }
        else {
            this.age = age;
        }
    }
}

