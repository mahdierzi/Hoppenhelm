import javax.swing.*;

public class Window {
    JFrame jFrame;
     //creat the window
    public Window(Pannel pannel) {
       jFrame=new JFrame();
       jFrame.setSize(400,400);
       jFrame.setTitle("Hoppenhelm");
        jFrame.add(pannel);
       jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
       jFrame.setVisible(true);
    }
}
