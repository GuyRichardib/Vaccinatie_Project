package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalShelter {

    //Instance variables
    private List<Animal> animals = new ArrayList<>(); // all animals
    private int animalId = 1; // id counter


    //Constructor
    public AnimalShelter(){

    }

    //Methods


    public void addAnimal(Animal animal) {
        animal.setAnimalNumber(animalId++);   // gives a unique id
        animals.add(animal);                  // really add the animal
    }
    public int countAnimals(){

        long count =animals.stream().count();

        return Math.toIntExact(count);

        //return animals.size();
    }



    public void sortAnimals(){ // by number
        animals.sort(Comparator.comparingInt(Animal::getAnimalNumber));

    }
    public void sortAnimalsByName(){  // sort by alphabetical name

        animals.sort(Comparator.comparing(Animal::getName));

    }
    public void sortAnimalsByAge(){

        animals.sort(Comparator.comparingInt(Animal::getAge));

    }
    public void printAnimals(){  // displays all animals

        animals.forEach(System.out::println);


    }
    public void printAnimalsNotVaccinated(Disease disease){
        animals.stream()
                .filter(a -> !a.isVaccinated(disease))
                .forEach(System.out::println);


    }

    public Animal findAnimal(int animalNumber){  // search by id

        return animals.stream()
                .filter(a -> a.getAnimalNumber() == animalNumber)
                .findFirst()
                .orElse(null);
    }

    public Animal findAnimal(String name){

        return animals.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void treatAnimal(int animalNumber){



    }
    public void treatAnimal(String name){
        Animal a = findAnimal(name);   // lookup for the animal
        if (a != null) {               // check if it exists
            a.treatAnimal();           // treats him
        }

    }

    public void treatAllAnimals (){
        animals.forEach(Animal::treatAnimal);

    }

    public Animal findOldestAnimal(){

        Animal oldest = animals.get(0);

        for (Animal a : animals) {
            if (a.getAge() > oldest.getAge()) {
                oldest = a;
            }
        }
        return oldest;

    }




    //Getters & Setters

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals() {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

}
