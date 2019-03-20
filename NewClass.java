/*<applet code="NewClass" height=200 width=200>
</applet>*/
import java.applet.*;
import java.awt.*;

public class NewClass extends Applet {
	String s;
	public void init(){
		s="Jishnu";
	}
   public void paint (Graphics g) {
      g.drawString(s, 50, 100);
   }
}


