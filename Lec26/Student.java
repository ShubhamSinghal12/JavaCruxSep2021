package Lec26;

public class Student {

	static String schoolName = "ABC";
	public static int no_Of_Students = 0;
	public static final int max_Students = 1000;
	
	private String name = "*";
	private int age = 5;
	private final int rollno;
	
	public Student()
	{
		this("-",10);
	}
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
		no_Of_Students++;
		this.rollno = no_Of_Students;
	}
	
	public Student(Student s)
	{
		this.name = s.name;
		this.age = s.age;
		no_Of_Students++;
		this.rollno = no_Of_Students;
	}
	
	public static int add(int a,int b)
	{
//		int ag = age;
		System.out.println(schoolName);
		return a+b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age >100)
			this.age = 0;
		else
			this.age = age;
	}
	
	
	public void introduceYourself()
	{
		System.out.println("Hi my name is "+this.name+" and my rollno is "+this.rollno);
	}
	
	public void sayHi(String name)
	{
		System.out.println(this.name+" says hi to "+name);
	}
	
	

}
