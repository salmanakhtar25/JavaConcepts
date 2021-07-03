package thiskeyword;

public class constructorChaining {
	public static void main(String[] args) {
		thisdemo td=new thisdemo();
	}
}

class thisdemo{

	thisdemo(){
		this(10);
		System.out.println("non parametrized constructor");
	}
    thisdemo(int i){
		this("salman");
		System.out.println("int type argument");
	}
	thisdemo(String s){
		System.out.println("String type arg");
	}
}
