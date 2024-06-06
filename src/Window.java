import javax.swing.*;

public class Window {
    JFrame jFrame;
     //creat the pannel
    public Window() {
       jFrame=new JFrame();
       jFrame.setSize(400,400);
       jFrame.setTitle("Hoppenhelm");
       jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
       jFrame.setVisible(true);
    }
}
