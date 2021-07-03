package ExceptionHandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i=9;
		int j=0;
		try{
		int k=i/j;//arithmetic exception
		}
		catch(ArithmeticException e){
			System.out.println("Error");
			
		}
		try{
		int arr[]=null;
		arr[6]=8;//unchecked Exception null pointer exception.
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("stay in your limit");
		}
		catch(Exception e){
			System.out.println("something wrong");
		}
		finally{
			System.out.println("Bye");
		}
		
	}

}
