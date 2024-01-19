package ExceptionHandling;

public class UserDefinedException {
	public static void main(String[] args) {
		int i,j;
		i=8;
		j=9;
		try{
		int k=i/j;
		if(j==0)throw new salmanException("this is not possible");
		System.out.println(k);
		}
		catch(salmanException e){
			System.out.println("error "+ e.getMessage());
		}

	}

}
