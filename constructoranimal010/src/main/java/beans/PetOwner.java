package beans;

import myinterface.Animal;

public class PetOwner {
    private Animal obj;

    // Setter method for dependency injection
    public PetOwner(Animal obj) {
        this.obj = obj;
    }

    public void playWithPet() {
        System.out.print("Pet says: ");
        obj.makeSound();
    }
}