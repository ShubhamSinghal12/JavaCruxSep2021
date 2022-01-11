package Lec40;

public class Car{// implements Comparable<Car>{
	
	int price;
	int speed;
	String color;
	
	public Car()
	{
		
	}
	
	public Car(int price,int speed,String color)
	{
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	
	@Override 
	public String toString()
	{
		return "Price: "+this.price+" Speed: "+this.speed+" Color: " + this.color;
	}

//	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		
//		if(this.price > o.price)
//		{
//			return -1;
//		}
//		else if(this.price < o.price)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
		
//		return o.price - this.price;
//		return this.speed - o.speed;
		
		return this.color.compareTo(o.color);
	}

}
