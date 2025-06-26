package be.intecbrussel;

public class Monkey extends Animal{


    //Instance variable
    private boolean isHyperActive = true; // value set to "true" to show treatment has been done


    //Constructors
    public Monkey( String name, int age){
        super(age, name);
    }

    public  Monkey(boolean isHyperActive){
        this.isHyperActive = isHyperActive;
    }

    //Getters & Setters

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }



    //Override Methods

    @Override
    public void treatAnimal() {
        isHyperActive = false;
        super.treatAnimal(); //is set to true in the Animal class
    }

    @Override
    public String toString() {
        return "The monkey " + super.toString() + " Is Hyper active : " + (isHyperActive? "yes" : "no");
    }
}
