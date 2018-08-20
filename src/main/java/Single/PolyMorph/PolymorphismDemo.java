package Single.PolyMorph;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
    public static void main(String args[]) {
        //Now Pet will show How Polymorphism work in Java
        List<Pet> pets = new ArrayList<Pet>();

        //Add Cat
        pets.add(new PetCat());
        pets.add(new PetCat());

        //Add Dog
        pets.add(new PetDog());
        pets.add(new PetDog());

        //pet variable which is type of Pet behave different based
        //upon whether pet is Cat or Dog
        for(Pet pet : pets){
            pet.makeSound();
        }
    }
}
