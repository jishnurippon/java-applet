/*<applet code="J" height=200 width=200>
</applet>*/
import java.applet.*;
import java.awt.*;

public class J extends Applet{
	String name,add,email;
	
	public void init() {
		name = "Jishnu";
		add = "Kunnath";
		email = "jishnu.cs3@iiitmk.ac.in";
	}

	public void paint(Graphics g) {
	g.drawString(name, 50, 50);
	g.drawString(add, 50, 70);
	g.drawString(email, 50, 90);
	}
}
