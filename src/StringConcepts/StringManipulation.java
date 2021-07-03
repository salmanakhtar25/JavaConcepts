package StringConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		String str="The Rains have started here";
		String str1="The Rains have started here";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf("s"));

		System.out.println(str.indexOf("s", str.indexOf("s")+1));

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("hello"));//-1

		System.out.println(str.equals(str1));

		System.out.println(str.substring(0, 9));

		String s="   Hello world   ";
		System.out.println(s.trim());

		System.out.println(s.replace(" ", ""));


		String s3="selenium";
		char[] chars = s3.toCharArray();

		for(char i:chars){
			System.out.println(i);
		}
		String s1="hello_world_test_selenium";

		String s2[] = s1.split("_");

		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
		System.out.println(s.concat(s1));

		//Remove Junk
		//Regular Expression:[^a-zA-Z0-9]
		String junk="!@#$%%^&125668990 Selenium,.<>?";
		String withoutjunk = junk.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(withoutjunk);
	}
}
