package Inheritance;

class calculator{//super class
	public int add(int i,int j){
		return i+j;
	}
}

class CalcAdv extends calculator{//sub class
	public int add(int i,int j){
		return i+j;
	}

	public int sub(int i,int j){
		return i-j;
	}
}
class veryadvCalc extends CalcAdv{//multilevel Inheritance is supported but
	                 //multiple inheritance is not supported due to ambiguity.
	public int mul(int i,int j){
		return i*j;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		veryadvCalc c1=new veryadvCalc();
		System.out.println(c1.add(2,3));
		System.out.println(c1.sub(3, 2));
		System.out.println(c1.mul(3,2));

	}
}
