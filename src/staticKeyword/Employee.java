package staticKeyword;

public class Employee {
	
	String name;
	int empID;
	static String company="contata";
	
	public Employee(String name,int empID){
		this.name=name;
		this.empID=empID;
	}
	
	public void display(){
		System.out.println(name+" "+empID+" "+company);
	}
	public static void main(String[] args) {
		Employee e1=new Employee("salman",1334);
		e1.display();
		Employee e2=new Employee("shoeb",1333);
		e2.display();
	}
	
}
