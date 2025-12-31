import java.util.*;

public class Dog {

    //Attributenx
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
public Owner setOwner(Owner newOwner){
    owner = newOwner;
    return owner;

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
public int increaseAgeOfDog(){
        Scanner input = new Scanner (System.in);
        System.out.print("Years to add: ");
        int newYears = input.nextInt();
        return age = age + newYears;
}

public String toString(){
    return 
    "Dog:" + "\n" + 
    name.toString() + "\n" +
    breed.toString() + "\n" + 
    age + "\n" + 
    weight;
}

}
