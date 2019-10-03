// Program for Applet
import java.applet.*;
import java.awt.*;

/* <applet code="SimpleApplet.class" width="200" height="200" ></applet> */

public class SimpleApplet extends Applet{

	String msg = "Currently executing method : ";
	public void init(){
		msg+="init()";
	}
	public void start(){
		msg+="start()";
	}
	public void stop(){
		msg+="stop()";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
		showStatus("Test applet");
	}

}