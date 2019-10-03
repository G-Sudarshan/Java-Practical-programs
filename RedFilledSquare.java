// Program for colored square

import java.applet.*;
import java.awt.*;

/* <applet code="RedFilledSquare.class" width="500" height="500" ></applet>  */

public class RedFilledSquare extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawRect(100,100,100,100);
		g.fillRect(100,100,100,100);
	} 

}