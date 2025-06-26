package be.intecbrussel;

public class App {
    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();
        shelter.addAnimal(new Cat("Minoes",4));
        shelter.addAnimal(new Dog("Bello",6));
        shelter.addAnimal(new Monkey("George",10));
        shelter.addAnimal(new Cat("Mathew",12));
        shelter.addAnimal(new Dog("Luna",8));
        shelter.addAnimal(new Monkey("Bart",5));
        shelter.addAnimal(new Cat("Mimi", 3));
        shelter.addAnimal(new Dog("Rex", 5));
        shelter.addAnimal(new Monkey("Pierre", 2));


        //shelter.treatAllAnimals();
        shelter.treatAnimal("Bello");
        shelter.sortAnimalsByAge();
        shelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        Animal oudste = shelter.findOldestAnimal();
        System.out.println("\nOudste dier: "+oudste);
        System.out.println("Aantal dieren in het asiel: "+ shelter.countAnimals());
    }


}
