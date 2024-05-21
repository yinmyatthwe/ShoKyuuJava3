
public class practice4 extends MyFrame{
	public void run() {
		
	//練習問題4,1
			/*int x=30;
			int y=30;
			setColor(0,128,0);
			int i;
			for(i=0;i<9;i++) {
				fillRect(x,y,10,100);
				x+=20;
				y+=20;
			}*/
			
			
			//練習問題4.2
			/*int x=30;
			int h=20;
			setColor(0,128,0);
			int i=0;
			for(i=0;i<9;i++) {
				fillRect(x,100,10,h);
				x+=20;
				h+=20;
			}*/
			
			
			//練習問題4.3
			int x=30;
			int r=0;
			int g=0;
			int b=0;
			for(int i=0;i<9;i++) {
				setColor(r,g,b);
				fillRect(x,100,10,100);
				x+=20;
				r+=20;
				g+=20;
				b+=20;
			}
	}

}
