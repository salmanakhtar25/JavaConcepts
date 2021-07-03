package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) {

		try {//compiler forces us to handle this exception.
			FileInputStream fis=new FileInputStream("D://softwares.text");
		} 

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("this line will get executed irrespective of the exception");
		}

	}
}