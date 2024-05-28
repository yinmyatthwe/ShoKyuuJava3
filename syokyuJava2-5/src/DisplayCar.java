
public class DisplayCar extends MyFrame{
	public void run() {
		Car car1=new Car(100,100,40,20);
		Car car2=new Car(300,200,40,20);
		
		for(int i=0;i<30.;i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.x+=car1.vx;
			car2.x-=car2.vx;
			
			sleep(0.5);
		}
	}


}
