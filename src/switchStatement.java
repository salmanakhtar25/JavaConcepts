
public class switchStatement {
	public static void main(String[] args) {

		String s="2";

		switch(s){
		case "1":
			System.out.println("one");
			break;
		case "2":
			System.out.println("two");
			break;
		case "3":
			System.out.println("three");
			break;
		case "4":
			System.out.println("four");
			break;
		case "5":
			System.out.println("five");
			break;
		default:
			System.out.println("not a valid number");

		}
		for(int i=1;i<=7;i++){
			if(i%2==0){
				continue;//skip even numbers.
				}
			System.out.print(i+" ");
		}
	}
}
