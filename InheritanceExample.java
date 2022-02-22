
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a=new Animal();
        Dog d=new Dog();
        Cat c=new Cat();
        Kitten k=new Kitten();
        Monkey m=new Monkey();
        Horse h=new Horse();
        
        System.out.println("Print the behaviour of Animal ");
        a.eating();
        a.walk();
        System.out.println("Print the behaviour of Dog ");
        d.bark();
        d.eating();
        d.walk();
        System.out.println("Print the behaviour of Cat ");
        c.eating();
        c.drinkMilk();
        c.meow();
        c.walk();
        System.out.println("Print the behaviour of Kitten ");
        k.walk();
        k.eating();
        k.drinkMilk();
        k.play();
        System.out.println("Print the behaviour of Monkey ");
        m.walk();
        m.eating();
        m.jump();
        System.out.println("Print the behaviour of Horse ");
        h.walk();
        h.eating();
        h.run(); 
	}
	

}
class Animal{
	
	
	void eating() {
		
		System.out.println("Eat food");
	}
	
	void walk() {
		System.out.println("Walk");
	}
	
}
// Single Inheritance

class Dog extends Animal{
	
	void bark() {
		System.out.println("Barks");
	}
}

// Multi level Inheritance
class Cat extends Animal{
	void meow() {
		System.out.println("Cry meow");
		
	}
	void drinkMilk() {
		System.out.println("Drink Milk");
	}
}
class Kitten extends Cat{
	void play() {
		System.out.println("Play more");
	}
}

//Hierarchychal inheritance

class Monkey extends Animal{
	void jump() {
		System.out.println("Monkey can Jump");
	}
}
class Horse extends Animal{
	void run() {
		System.out.println("Horse can run fast");
	}
}