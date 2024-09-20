package beans;

import myinterface.Animal;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}
  
}