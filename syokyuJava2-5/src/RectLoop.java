
public class RectLoop extends MyFrame {
	public void run() {

		setColor(0,128,0);
		int x=0;
		for(int i=1;i<15;i++) {
			System.out.println(x);
			fillRect(x,80,10,100);
			x+=20;
		}
		
	}

}
