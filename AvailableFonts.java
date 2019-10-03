// Program for available fonts 
import java.awt.*;

public class AvailableFonts{
	public static void main(String[] args) {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String list[] = ge.getAvailableFontFamilyNames();

		for(int i=0;i<list.length;i++){
			System.out.println("Font : "+list[i]);
		}
	}
}