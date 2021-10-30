package Lec13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc";
		String s1 = "abc def";
		String s2 = new String("abc");
		String s3 = new String("abc");
		
		System.out.println(s2 == s3);
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.substring(1));
		
		String st = "hellolloll";
		System.out.println(st.lastIndexOf("lll"));
		
		String s4 = s3.concat(s1);
		System.out.println(s4);
		
		System.out.println(s2.equals(s3));
		
		System.out.println(st.replace('l', 'r'));
		System.out.println(st.replaceAll("ll","r"));
		System.out.println(st.replaceFirst("ll", "r"));
		

	}

}
