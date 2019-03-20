//draw lines
import java.awt.*;
import java.applet.*;
/*
<applet code="Lines" width=300 height=300>
</applet>
*/
public class Lines extends Applet {
public void paint(Graphics g) {
g.drawLine(110, 130, 100, 130);
g.drawLine(110, 100, 110, 130);
g.drawLine(100, 100, 120, 100);
g.drawLine(130, 100, 130, 130);
g.drawLine(150, 100, 170, 100);
g.drawLine(150, 120, 150, 100);
g.drawLine(150, 120, 170, 120);
g.drawLine(170, 130, 170, 120);
g.drawLine(170, 130, 150, 130);
g.drawLine(190, 100, 190, 130);
}
}