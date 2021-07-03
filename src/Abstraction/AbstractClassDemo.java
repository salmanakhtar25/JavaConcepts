package Abstraction;

abstract class Human{
	public abstract void eat();//we use abstract class so 
	//that no one creates its object
	public void walk(){
		//can give implementation in abstract class
	}
}

class Man extends Human{//Man is called concrete class
	@Override
	public void eat(){//its compulsory to override the abstract methods
		System.out.println("eats with hands");
	}
}


public class AbstractClassDemo {
	public static void main(String[] args) {
		Human h= new Man();
		h.eat();
	}
}
