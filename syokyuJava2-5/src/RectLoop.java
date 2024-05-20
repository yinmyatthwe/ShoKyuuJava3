
public class RectLoop extends MyFrame {
	public void run() {

		setColor(0,128,0);
		int x=30;
		while(x<=210) {
			System.out.println(x);
			fillRect(x,80,10,100);
			x+=20;
			
		}
		
	}

}
