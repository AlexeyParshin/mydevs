package ImageRendering;

import com.sun.javafx.iio.ImageStorageException;
import sun.awt.image.ImageAccessException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by dip17_000 on 09.10.2016.
 */
public class ImageRen {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyFrame extends JFrame {
    private JButton jbtn;

    MyFrame() {
        jbtn = new JButton("Show image");

        setTitle("Image rendering");
        setSize(400, 400);
        MyPanel panel = new MyPanel();
        panel.setLayout(new GridLayout(1,2));
        Container pane = getContentPane();
        pane.add(panel);

        panel.add(jbtn);
    }
}

class MyPanel extends JPanel implements ActionListener {
    private Image im;
    private Graphics g;


    public MyPanel() {
        try {
            im = ImageIO.read(new File("D:\\temp\\ttImage.jpg"));
        } catch (IOException exc) {
            System.out.println("I/O EXCEPTION");
        }
    }

    public void paintComponent(Graphics _g) {
        super.paintComponent(_g);
        g = _g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Show image"))
            g.drawImage(im, 50, 50, null);
    }
}
