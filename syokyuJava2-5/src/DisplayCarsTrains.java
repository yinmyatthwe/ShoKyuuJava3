
public class DisplayCarsTrains extends MyFrame{
	public void run() {
		Vehicle[] vehicles=new Vehicle[3];
		vehicles[0]= new Car(10,30,3,0);
		vehicles[1]= new Car(10,100,5,0);
		vehicles[2]= new Train(10,150,7,0);
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<vehicles.length;j++) {
				vehicles[j].draw(this);
				vehicles[j].move();
			}
			sleep(0.1);
		}	 
	}
}
