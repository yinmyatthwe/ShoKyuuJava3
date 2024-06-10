
public class PlayerAnimationJava extends MyFrame {
	public void run() {
		Car player = new Car(100,200,3,0);
		while(true) {
			clear();
			player.draw(this);
			player.move();
			sleep(0.1);
		}
	}

}
