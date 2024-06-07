import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Pannel extends JPanel {
    private Mouse mouse;
    private float x=100,y=100;
    private float ydir=0.06f,xdir=0.06f;
    private int frames=0;
    private long lastcheck=0;
    private Color color=new Color(150,20,90);
    private Random random;
    public Pannel() {
        random=new Random();
        mouse=new Mouse(this);
        addKeyListener(new Keys(this));//pass it
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }
     // move in x direction
    public void changexdelta(int value){
        this.x+=value;

    }
    // move in y direction
    public void changeydelta(int value) {
        this.y += value;

    }
    public void setposition(int x,int y){
        this.x=x;
        this.y=y;

    }
    //this grafic object let us draw on jframe(like paintbrush)
    public void paint(Graphics grafic){
        super.paint(grafic);
        updaterec();
        grafic.setColor(color);
        grafic.fillRect((int)x,(int) y,200,50);
        frames++;
        //how many frames in milliseconds and then remove the lastcheck
        if (System.currentTimeMillis()-lastcheck>=1000){
            lastcheck=System.currentTimeMillis();
            System.out.println(frames);
            //it should be zero because it will count since we start
            frames=0;
        }
        //loop game
        repaint();

    }
    //moves without our inputs
    private void updaterec(){
        x+=xdir;
        if (x>400||x<0){
            xdir*=-1;
            color=getRndcolor();
        }
        y+=ydir;
        if (y>400||y<0){
            ydir*=-1;
            color=getRndcolor();
        }
    }
    //get a random color
    private Color getRndcolor(){
        int r=random.nextInt(255);
        int b=random.nextInt(255);
        int g=random.nextInt(255);
        return new Color(r,b,g);
    }
}
