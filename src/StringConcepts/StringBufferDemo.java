package StringConcepts;

public class StringBufferDemo {
   public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	
	System.out.println(sb.capacity());            //16+string length
	
	sb.append("hello");
	
	System.out.println(sb.capacity());//16
	
	sb.append("salman akhtar khan");
	
	System.out.println(sb.capacity());//old capacity*2+2=34
	
	System.out.println(sb.length());//characters present
	
	System.out.println(sb.charAt(3));
	
	System.out.println(sb.delete(2, 5));
	
	System.out.println(sb.deleteCharAt(7));
	
	StringBuffer sb1=new StringBuffer("deepak java");
	StringBuffer sb2=new StringBuffer("deepak java");
	
	System.out.println(sb1.equals(sb2));//False because referring different objects.
	
	System.out.println(sb1.indexOf("j"));
	
	System.out.println(sb1.insert(3, "zzz"));
	
	System.out.println(sb1.replace(3, 6, "m"));
	
	System.out.println(sb1.reverse());
	
	System.out.println(sb2.subSequence(3, 6));
	
	System.out.println(sb2.toString());
	
	sb1.ensureCapacity(100);
	
	System.out.println(sb1.capacity());
	
	sb1.setLength(4);
	
	System.out.println(sb1);
	
	
}
}
