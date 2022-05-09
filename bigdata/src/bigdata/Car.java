package bigdata;

//import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Car {
	/* Add your code here */
	
		private final long model;
		private final long version;
		  
		  public Car(long model, long version) {
		    this.model = model;
		    this.version = version;
		    
		  }

		  public String toString() {
		    return this.model + " " + this.version;
		  }
		
		
	

	public static void main(String args[]) throws NumberFormatException, IOException {
		/* Add your code here */
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int size = Integer.valueOf(br.readLine().trim());
	        ArrayList<Car> cars = new ArrayList<Car>(size);
	        for(int i = 0; i < size; i++) {
	            String[] details = br.readLine().split(" ");
	            long model = Long.parseLong(details[0]);
	            long version = Long.parseLong(details[1]);
	            Car car = new Car(model,version);
	            cars.add(car);
	        }
	        
	        Collections.sort(cars,
	        new Comparator<Car>() {

	            @Override
	            public int compare(Car o1, Car o2) {
	                int index = Long.compare(o1.model, o2.model);
	                if(index == 0) {
	                    return Long.compare(o1.version, o2.version);
	                }else {
	                    return index;
	                }
	            }
	        });
	        
	        for(Car car : cars) {
	            System.out.println(car);
	        }
	        
		
	}
	

}

