package superKeyword;
class B {
	public B(int i){
		System.out.println("super class constructor");
	}
	int i=20;
	void display(){
		System.out.println("salman");
	}
}

public class A extends B {
	public A(){
		super(3);//1.used to call the constructor of parent class
	}
	int i=10;
	void show(){
		System.out.println(super.i);//2.used to call instance variable of super class. 
		System.out.println(i);
		super.display();//3.used to call methods of super class
	}
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
	}
}

