
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
		/*int x=30;
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
		}*/
		
	//追加課題その１
		/*int x=20;
		int y=20;
		int w=20;
		int h=20;
		setColor(0,128,0);
		int i=0;
		for(i=0;i<7;i++) {
			fillRect(x,y,w,h);
			x=w+x;
			y=h+y;
			w+=10;
			h+=10;
		
		}*/
	//追加課題その2
		int x=30;
		int h=220;
		int y=50;
		setColor(0,128,0);
		int i=0;
		
			for(i=0;i<10;i++) {
				fillRect(x,y,10,h);
				x+=20;
				h-=20;
			}
			
		if(h<30) {
			//h=20;
			x=30;
			y=300;
			for(i=0;i<10;i++) {
				fillRect(x,y,10,h);
				x+=20;
				h+=20;
				y-=20;
		
			}	
		
		}
	}	
	

}
