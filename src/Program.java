public class Program {
    
    public static void main(String[] args){

        //Intressanta här är att jag inte behlver använda string för att william owner är av datatypen owner, då skriver jag enbart owner och så förblir det datatypen 
        Owner william = new Owner("William");
        Owner rasmus = new Owner("rasmus");
        Dog sui = new Dog("William", "12", 21, 70);
        Dog dui = new Dog("Siri", "Maincoon", 1, 3);


        sui.setOwner(rasmus); // För att kunna set owner måste ett obejkt  för den ownern redan finnas....
        dui.setOwner(william);

        System.out.println(sui.getOwner());
        System.out.println(dui.getOwner());
        System.out.print(sui.toString());
        








    }



}
