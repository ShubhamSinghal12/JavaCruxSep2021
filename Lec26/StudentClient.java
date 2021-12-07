package Lec26;

public class StudentClient {

	String sur;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Aayush",20);
		s.introduceYourself();
//		System.out.println(s);
//		s.name = "Aayush";
//		s.age = -10;
		s.setName("Rama");
		s.setAge(-10);
//		System.out.println(s.name+" "+s.age);
		Student s1 = new Student(s);
//		s1.name = "Ram";
//		s1.age = 15;
		
		s.introduceYourself();
		s1.introduceYourself();
		
		System.out.println(s);
		System.out.println(s1);
		s.sayHi("Sham");
		
		s.schoolName = "XYZ";
		System.out.println(s.schoolName);
		System.out.println(s1.schoolName);
		
		s.add(0, 0);
		Student.add(0, 0);
		
		StudentClient sc = new StudentClient();
		sc.sur = "surname";
		System.out.println(sc.sur);
		
//		System.out.println(s1.name+" "+s1.age);
		
		
//		Student s2 = s;
//		System.out.println(s2.name+" "+s2.age);
		
//		int myage = 30;
//		String myname = "Shyam";
//		
//		System.out.println(s.name+" "+s.age);
//		System.out.println(myname+" "+myage);
//		
//		Test3(s,s.age,s.name,myage,myname);
//		
//		System.out.println(s.name+" "+s.age);
//		System.out.println(myname+" "+myage);
		

	}
	
//	public static void Test3(Student s, int age, String name, int myAge, String myName) {
//	s.age = 0;
//	s.name = "_";
//	age = 10;
//	name = "Shri";
//	myAge = 0;
//	myName = "_";
//}
//	
//	public static void Test2(Student s2, Student s3) {
//
//		s2 = new Student();
//		int tempa = s2.age;
//		s2.age = s3.age;
//		s3.age = tempa;
//
//		s3 = new Student();
//		String tempn = s2.name;
//		s2.name = s3.name;
//		s3.name = tempn;
//		System.out.println(s2.name + " " + s2.age);
//		System.out.println(s3.name + " " + s3.age);
//
//	}
//	
//	
//	public static void Test1(Student s2, Student s3) {
//	Student t = s2;
//	s2 = s3;
//	s3 = t;
//	System.out.println(s2.name + " " + s2.age);
//	System.out.println(s3.name + " " + s3.age);
//}
//

}
