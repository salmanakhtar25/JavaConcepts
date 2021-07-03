package thiskeyword;

public class Uses_of_this_keyword {
public static void main(String[] args) {
	Test2 t2=new Test2();
	t2.show();
	Test1 t1=new Test1();
	t1.setvalue(10);
	t1.show();
}

}
class Test1{
	int i;
	void setvalue(int i){
		this.i=i;//invoke current class instance variables.
	}
	void show(){
		System.out.println(i);
	}
}

class Test2{
	void display(){
		System.out.println("hello");
	}
	
	void show(){
		this.display();//invoke current class method.
	}
	
	
}
