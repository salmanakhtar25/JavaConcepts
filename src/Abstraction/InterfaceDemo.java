package Abstraction;


interface writer{
	int a=10;//by default its public static and final
	void write();
	//By default its public abstract method

	default void wrote(){
		System.out.println("can create concrete methods using default method");
	}
	public static void written(){
		System.out.println("can create concrete methods using static method");
	}

}

class pen implements writer{
	@Override
	public void write(){
		System.out.println("I am a pen");
	}

}

class pencil implements writer{
	public void write(){
		System.out.println("I am a pencil");
	}
}

class kit{
	public void dosomething(writer p){
		p.write();
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		kit k =new kit();
		writer p=new pen();
		writer pc=new pencil();
		k.dosomething(p);
		k.dosomething(pc);
	}
}
