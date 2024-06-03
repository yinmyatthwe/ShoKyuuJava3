
public class Car {
    int x,y,vx,vy;
    public Car(int x,int y,int vx,int vy) {
        this.x=x;
        this.y=y;
        this.vx=vx;
        this.vy=vy;
    }
    
    public void draw(MyFrame frame) {
        frame.fillRect(x, y, vx, vy);
        frame.fillRect(x-20, y+20, vx+40, vy);
        frame.fillOval(x-10, y+40, vx-20, vy);
        frame.fillOval(x+30, y+40, vx-20, vy);
    }
    public void move(int m) {
    	x+=m+1;
    }
   
}
