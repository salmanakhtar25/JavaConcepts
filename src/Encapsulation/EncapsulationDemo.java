package Encapsulation;

class student{
	private int rollno;
	private String name;

	public int getRollno() {
		System.out.println("user is accessing the rollno");
		return rollno;
	}

	public String getName() {
		return name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("rollno changed by user");// maintain log file
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationDemo {
	public static void main(String[] args) {
		student s1=new student();
		s1.setRollno(2);
		System.out.println(s1.getRollno());
		s1.setName("salman");
		System.out.println(s1.getName());
	}
}
