public class Owner {

    //Skapar objekt-mallen 
    private String name;

    //Skapar en huvud-konstruktor
    public Owner (String name){
        this.name = name.toUpperCase();

    }

    //Metoder/operationerna
    public String getName(){
        return name;
    }

    public String toString(){
        return name.toString();
    }

    
}
