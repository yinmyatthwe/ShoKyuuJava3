
public class DisplayRectsSlow extends MyFrame {
	public void run() {
		
	setColor(0,128,0);
	int x=30;
	int y=80;
	while(x<=170) {
		fillRect(x,y,10,100);
		x+=20;
		y+=20;
		sleep(1);
	}
	}

}
