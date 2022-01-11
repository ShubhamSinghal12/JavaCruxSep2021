package Lec40;

import java.util.Comparator;

public class SpeedPriceComp implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		if(o1.speed == o2.speed)
		{
			return o2.price-o1.price;
		}
		else
		{
			return o1.speed-o2.speed;
		}
	}

}
