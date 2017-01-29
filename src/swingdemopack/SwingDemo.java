package SWINGDEMOPACK;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SwingDemo implements ActionListener {
    public static final int WIDTH = 350;
    public static final int HEIGHT = 300;
    private JFrame jfrm;
    private JLabel jlabContents, f_labs;
    private JTextField jtf;
    private JButton jbtnChs, jbtnRef;
    private ArrayList<String> film_list;
    private ArrayList<JLabel> FILM_DISP_List;
    private JPanel labPanel;
    private JPanel butPanel;
    private int count;
    //protected int tt;

    public SwingDemo() {
        count = 0;
        film_list = new ArrayList<>();
        FILM_DISP_List = new ArrayList<>();

        butPanel = new JPanel();
        labPanel = new JPanel();
        //scrollpanel = new JScrollPane(labPanel);
        labPanel.setLayout(new BoxLayout(labPanel, BoxLayout.Y_AXIS));
        butPanel.setLayout(new GridLayout(2, 2));

        jfrm = new JFrame("WHATFILM");
        jtf = new JTextField(15);
        jbtnChs = new JButton("Choose one");
        jbtnRef = new JButton("Refresh");
        jlabContents = new JLabel("ДИМАС ЖОПОЛАС");
        //jlabContents.setAlignmentX(JLabel.CENTER);
        //jfrm.setLayout(new FlowLayout());

        jfrm.setSize(WIDTH, HEIGHT);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jtf.setActionCommand("myTF");


        jtf.addActionListener(this);
        jbtnChs.addActionListener(this);
        jbtnRef.addActionListener(this);

        butPanel.add(jlabContents);
        butPanel.add(jtf);
        butPanel.add(jbtnChs);
        butPanel.add(jbtnRef);

        jfrm.setLayout(new BorderLayout());
        jfrm.add(butPanel, BorderLayout.NORTH);
        jfrm.add(labPanel, BorderLayout.CENTER);
        //jfrm.pack();
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Choose one")) {
            //jfrm.add(jlabContents);
            if (film_list.size() < 1) {
                jlabContents.setText("YOU ARE A FUCKFACE");
            } else {
                int rd = 0;
                for (int i = 0; i < 3; i++)
                    rd = (int) (Math.random() * count);

                jlabContents.setText(film_list.get(rd));
            }
            jtf.setText("");
        } else if (ae.getActionCommand().equals("Refresh")) {
            if (FILM_DISP_List.size() > 0) {
                while (FILM_DISP_List.size() > 0) {
                    JLabel label = FILM_DISP_List.remove(FILM_DISP_List.size() - 1);
                    labPanel.remove(label);

                    labPanel.repaint();
                    labPanel.revalidate();
                }
            }

            film_list.clear();
            jlabContents.setText("ДИМАС ЖОПОЛАС");
            jtf.setText("");
        } else {
            String film = jtf.getText();

            jtf.setText("");
            count = FILM_DISP_List.size() + 1;

            f_labs = new JLabel(count + ". " + film);
            f_labs.setAlignmentX(JLabel.CENTER_ALIGNMENT);

            FILM_DISP_List.add(f_labs);
            film_list.add(film);
            labPanel.add(f_labs);

            labPanel.repaint();
            labPanel.revalidate();
        }
    }
}