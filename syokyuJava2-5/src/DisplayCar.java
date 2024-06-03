import java.util.Vector;

public class DisplayCar extends MyFrame{
    public void run() {
    	Vector<Car> cars = new Vector<Car>();
    	cars.add(new Car(50,50,40,20));
    	cars.add(new Car(80,110,40,20));
    	cars.add(new Car(110,170,40,20));
    	cars.add(new Car(140,240,40,20));
    	cars.add(new Car(170,310,40,20));
        for(int i=0;i<30;i++) {
        	clear();
        	for(int j=0;j<cars.size();j++) {
                 cars.get(j).draw(this);
                 cars.get(j).move(j);
        	 }
        	sleep(0.1);
           
        }
    }
}
