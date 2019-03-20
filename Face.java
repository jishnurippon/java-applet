import java.awt.*;
import java.applet.*;
/*
<applet code="Face" width=500 height=500>
</applet>
*/
public class Face extends Applet {
public void paint(Graphics g) {

g.setColor(Color.yellow);	
g.fillOval(20, 20, 300, 300);
g.setColor(Color.red);
g.fillOval(80, 100, 51, 51);
g.fillOval(220, 100, 51, 51);
g.drawArc(125, 180, 100, 70, 225, 90);

}
}