package Lec27;

public class Person {
	
	private String name;
	private int age;
	
	
	public Person(String name,int age)
	{
		this.name = name;
		System.out.println(this.name);
		setAge(age);
		System.out.println(this.age);
	
	}
	
	public Person() throws Exception
	{
		this("-",0);
	}
	
	
	public void introduceYourself()
	{
		System.out.println("Hi my name is "+this.name+" and my age is "+this.age);
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

	public void setAge(int age){
		try {
			if(age<0 || age > 100)
				throw new Exception("Wrong Age Entered");

			this.age = age;
			return;
		}

		catch(Exception e) {
			e.printStackTrace();
			this.age = 10;
//			System.out.println("Error msg: "+e.getMessage());
			
		}
		
		finally {
			System.out.println("In finally block");
		}
		
		
	}

}
