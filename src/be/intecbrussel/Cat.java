package be.intecbrussel;

public class Cat extends Animal{

    //Instance variable

    private boolean hasLongNails = true; // value set to "true" to show treatment has been done

    //Constructors

    public Cat( String name, int age){
        super(age, name);
    }
    public Cat (boolean hasLongNails){
        this.hasLongNails=hasLongNails;
    }

    //Getter & Setters

    public boolean isHasLongNails() {
        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    //Override Methods

    @Override
    public void treatAnimal() {
        hasLongNails = false;
        super.treatAnimal();               //is set to true (is clean) in the Animal class
    }

    @Override
    public String toString() {
        return "The cat " + super.toString() + " Has long nails : " + (hasLongNails ? "yes" : "no");
    }

    //on peut utiliser les "optional class" ça n'est pas inscrit dans l'UML mais on peut

}
