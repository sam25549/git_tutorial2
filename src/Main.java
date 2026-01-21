
class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: oink oink");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("The cat says: meow meow");
<<<<<<< HEAD
=======
	}
}

class Chicken extends Animal {
	public void animalSound() {
		System.out.println("The chicken says: cluck cluck");
>>>>>>> development_2
	}
}

class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		myCat.animalSound();
	}
}
