/**
 * Created by t-nich on 7/11/2017.
 */
import java.awt.*;

public class Main {
    public static DrawingPanel panel;
    public static Graphics g;
    public static double panelW;
    public static double panelH;
    public static void main(String[] args) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        panelW = screen.getWidth()-40;
        panelH = screen.getHeight()-90;
        if (panelW > panelH) {
            panelW = panelH;
        } else if (panelH > panelW) {
            panelH = panelW;
        }

        panel = new DrawingPanel((int)Math.floor(panelW), (int)Math.floor(panelH));
        g = panel.getGraphics();

        Quarterback RW = new Quarterback("Russell", "Wilson", "SEA");
        inputRWData(RW);

        drawGraphAxes();
    }

    public static void inputRWData(Quarterback qb) {
        qb.passYards[0] = 258;
        qb.passYards[1] = 254;
        qb.passYards[2] = 243;
        qb.passYards[3] = 309;
        qb.passYards[4] = 0;
        qb.passYards[5] = 270;
        qb.passYards[6] = 225;
        qb.passYards[7] = 253;
        qb.passYards[8] = 282;
        qb.passYards[9] = 348;
        qb.passYards[10] = 272;
        qb.passYards[11] = 151;
        qb.passYards[12] = 277;
        qb.passYards[13] = 240;
        qb.passYards[14] = 229;
        qb.passYards[15] = 350;
        qb.passYards[16] = 258;
    }

    public static void drawGraphAxes() {
        int graphWidth = (int)Math.floor(((int)Math.floor(panelW) - 80)/16);
        for (int i = 0; i < 17; i++) {
            g.drawLine(40+(i*graphWidth), (int)Math.floor(panelH)-40, 40+(i*graphWidth), (int)Math.floor(panelH)-30);
            g.drawString(Integer.toString(i+1), 40+(i*graphWidth), (int)Math.floor(panelH)-10);
        }


    }
}
