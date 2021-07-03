package Polymorphism;

class casio{
	
	public void add(int i,int j){
		System.out.println(i+j);
	}
	public void add(int i,int j,int k){
		System.out.println(i+j+k);
	}
	
	public void add(double i,double j){
		System.out.println(i+j);
	}
	
}

public class MethodOverloading {
public static void main(String[] args) {
	casio c1=new casio();
	c1.add(2,3,4);//compile time polymorphism
	c1.add(2.6, 4.2);
	c1.add(2, 3,4);
}
}
