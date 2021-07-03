package Constructors;

class calc{  //By default java provides a default constructor
	int num1;
	int num2;
	
	public calc(){
		System.out.println("calling the non parametrized constructors");
		num1=1;
		num2=3;
	}
	
	public calc(int n1,int n2){
		System.out.println("calling parametrized constructor");
		num1=n1;
		num2=n2;
	}
}

public class Constructor {
public static void main(String[] args) {
	
	calc obj=new calc();            // calls the constructor of calc class.
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	
	calc obj2=new calc(5,6);
	System.out.println(obj2.num1);
	System.out.println(obj2.num2);
}
}
