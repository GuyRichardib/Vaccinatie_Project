package be.intecbrussel;

public class Dog extends Animal{

    //Instance variable

    private boolean hasFoulBreath = true; // value set to "true" to show treatment has been done


    //Constructors

    public Dog( String name, int age){
        super(age, name);
    }
    public Dog(boolean hasFoulBreath){
        this.hasFoulBreath =hasFoulBreath;
    }

    //Getters & Setters

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }


    //Override Methods

    @Override
    public void treatAnimal() {
        hasFoulBreath = false;
        super.treatAnimal();    //is set to true (is clean) in the Animal class
    }

    @Override
    public String toString() {
        return "The dog " + super.toString() + " Has foul breath : " + (hasFoulBreath ? "yes" : "no");
    }
}
