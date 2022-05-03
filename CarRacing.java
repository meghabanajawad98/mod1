package task3;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {
Integer trackCount;
	
	
	
	List<Car>cars=new ArrayList<Car>();
	
	public CarRacing(int trackCount) {
		super();
		this.trackCount = trackCount;
	}

	public String carEntry(Car car){
		if(this.trackCount.equals(cars.size()) ) {
			
			return "No Space";
		}
		
			for(Car ref:cars) {
				
				if(ref.carId.equals(car.carId)) {
					
					return "Already Exists";
					
				}
			}
		this.cars.add(car);
		
		
		return "Start practicing";
		
	}
	
	public int getWinner(int trackLength) {
		
		
		return 0;
		
	}

}
