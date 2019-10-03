// Program for FontMetrics 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="FontMetricsDemo.class" width="500" height="500" ></applet>  */

public class FontMetricsDemo extends Applet{
	public void init(){
		Font f = new Font("Serif",Font.BOLD,20);
		setFont(f);
	}

	public void paint(Graphics g){
		FontMetrics fm = g.getFontMetrics();

		int asc = fm.getAscent();
		int des = fm.getDescent();
		int led = fm.getLeading();
		int hgt = fm.getHeight();

		g.drawString("FontMetrics for Serif Font",50,70);
		g.drawString("ascent : "+Integer.toString(asc),100,100);
		g.drawString("descent : "+Integer.toString(des),100,140);
		g.drawString("Leading : "+Integer.toString(led),100,180);
		g.drawString("Height : "+Integer.toString(hgt),100,220);
	}
}