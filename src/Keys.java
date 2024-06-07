import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keys implements KeyListener {

    private Pannel pannel;

    public Keys(Pannel pannel){
        //have acsses to pannel in here
        this.pannel=pannel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:
                //move up
                pannel.changeydelta(-5);
                break;
            case KeyEvent.VK_A:
                //move left
                pannel.changexdelta(-5);
                break;
            case KeyEvent.VK_S:
                //move down
                pannel.changeydelta(+5);
                break;
            case KeyEvent.VK_D:
                //move right
                pannel.changexdelta(+5);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}