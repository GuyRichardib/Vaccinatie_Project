package be.intecbrussel;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable,Treatable {

    // private attributes
    protected int age;
    protected String name;
    protected  int animalNumber;
    protected boolean isClean;
    protected Map<Disease, Boolean > isVaccinated = new HashMap<>();;


    //Constructors
    public Animal (){

    }

    public Animal (int age, String name){
        this.age = age;
        this.name = name;

    }

    //Getters & Setters
    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }


    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }



    //Methods



    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease, true);
    }

    public boolean isVaccinated(Disease disease) {
        return isVaccinated.getOrDefault(disease, false);
    }

    @Override
    public void treatAnimal() {
        isClean = true;                    // Treat by default
    }

    //ToString

    public  String toString(){

        return getName()+ " is " + getAge()+"years old"+ " id#: "+getAnimalNumber()+"| ";
    }



}
