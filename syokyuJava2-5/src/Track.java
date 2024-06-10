
public class Track extends Vehicle{
	public Track(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+60, y, 40, 15);
		frame.fillRect(x, y+15, 100, 15);
		frame.fillOval(x+10, y+30, 10, 10);
		frame.fillOval(x+30, y+30, 10, 10);
		frame.fillOval(x+80, y+30, 10, 10);
		
	}

}
