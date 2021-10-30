package Lec13;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abc";
		StringBuilder sb = new StringBuilder(st);
		StringBuilder sb1 = sb;
		
//		System.out.println(sb);
//		System.out.println(sb.length());
//		System.out.println(sb.charAt(1));
//		System.out.println(sb.substring(1));
////		StringBuilder sbt = sb.substring(1);
//		
////		sb.append("def");
//		sb.insert(1, 1010);
//		System.out.println(sb1);
//		System.out.println(sb.charAt(2));
//		
//		sb.setCharAt(0, 'x');
//		System.out.println(sb);
//		
//		sb.deleteCharAt(0);
//		System.out.println(sb);
//		
//		sb.delete(0, 3);
//		System.out.println(sb);
//		
//		
//		String st2 = sb.toString();
//		System.out.println(st2);
//		
		
		long startTime = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++)
		{
			sb.append("a");
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);

	}

}
