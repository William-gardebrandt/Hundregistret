import java.util.*;

public class Dog {

    //Attributer
    private String name;
    private String breed;
    private int age;
    private int weight;
    private Owner owner;


    //Huvudkonstruktor här kan owner var null...
    public Dog(String name, String breed, int age, int weight){
        this.name = name.toUpperCase();
        this.breed = breed.toUpperCase();
        this.age = age;
        this.weight = weight;
    }
    //Sekundär konstruktor -- detta för när owner inte är null
    public Dog(String name, String breed, int age, int weight, Owner owner){
        this(name, breed, age, weight);
        this.owner = owner;
    }

    //Metoderna
public String getName() {
    return name;
}

public String getBreed() {
    return breed;
}

public int getAge(){
    return age;
}

public int getWeight(){
    return weight;
}

//HUr Fungerar det egentligen när man använder en klass som dat
public Owner getOwner(){
    return owner;
}

//För att denna metod ska kunna fungera måste datan som skickas in i metoden redans finnas som ett objekt av klassen Owner.
public void setOwner(Owner newOwner){
    owner = newOwner;
}



//DENNA METOD TAR FRAM SVANSLÖNGDDEN; MEN 1: KAN MAN INTE DEKLARERAR LISTAN SOM ATTRIBUT?
//FÖR DET ANDRA, HUR BLIR DET NÄR MAN SKA KALLA DENNA MEOTD? VARFÖR SKICKAS SVANSLÖNGD IN?

public double getTailLength(){
    ArrayList <String> taxLista = new ArrayList <>(List.of("TAX", "DACHSHUND", "MÄYRÄKOIRA", "TECKEL"));
    if(taxLista.contains(breed)){
        return 3.7;
    }
        return (double)(age * weight) / 10;
}

//UPPDATTERA ÅLDER
public void increaseAgeOfDog() {
        age += 1;
    if(age == Integer.MAX_VALUE + 1){
        age = Integer.MAX_VALUE;
    }



}

public String toString(){
    return 
    "Dog" + "\n-------" + "\nName: " +
    name.toString() + "\nBreed: " +
    breed.toString() + "\nAge: " +
    age + "\nWeight: " +
    weight + "\nOwner: " +
            owner;

}

}
