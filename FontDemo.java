// Program for font
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="FontDemo.class" width="500" height="500" ></applet> */

public class FontDemo extends Applet{

	Font F;
	public void init(){
		F = new Font("Dialog",Font.BOLD,17);
		setFont(F);

		Label l1 = new Label("Dialog Font");
		add(l1);
	}

	public void paint(Graphics g){
		String msg = "Serif Font";
		Font f1 = new Font("Serif",Font.BOLD | Font.ITALIC, 28);
		g.setFont(f1);
		g.drawString(msg,100,300);
	}

}