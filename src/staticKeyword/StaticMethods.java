package staticKeyword;

public class StaticMethods {

	static int i=10;

	static void display(){
		System.out.println(i);//can access only static data members through static methods.
	}

	void show(){
		display();//can call static method from non static method but reverse is not allowed.
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		display();
		StaticMethods m1=new StaticMethods();
		m1.show();
	}
}

