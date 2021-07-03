package Polymorphism;

class Animal{
	public void move(){
		System.out.println("animals can move");
	}
}
class Dog extends Animal{

	@Override
	public void move(){
		System.out.println("Dogs can walk and run");
	}
	public void bite(){
		System.out.println("bites with teeth");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.move();
		Animal b=new Dog();
		b.move();//Runtime Polymorphism using upcasting
		Dog c=(Dog) b;
		c.bite();//downcasting to access the bite method

	}

}
