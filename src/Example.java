
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


/**
 * Created by dip17_000 on 29.02.2016.
 */

class Quicksort {
    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, у;
        i = left;
        j = right;

        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                у = items[i];
                items[i] = items[j];
                items[j] = у;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }
}
class Stack {
    private char q[];
    private int putloc, getloc;

    Stack(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    Stack(Stack ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Stack(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) push(a[i]);
        System.out.println("Array has put");
    }

    void push(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Стек заполнен");
            return;
        }

        q[putloc] = ch;
        putloc++;
        getloc = putloc;
    }

    char pop() {
        if (getloc == 0) {
            System.out.println(" - Стек пуст");
            return (char) 0;
        }
        getloc--;
        return q[getloc];
    }
}
class recStr {
    String str;

    recStr() {
        str = "";
    }

    String outStr(String _str) {
        str += _str.charAt(_str.length() - 1);
        if (_str.length() == 1) {
            return "";
        }
        return outStr(_str.substring(0, _str.length() - 1));
    }
}
class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if (idx != str.length() - 1)
            backward(idx + 1);
        System.out.print(str.charAt(idx));
    }
}
class Kordan {
    public static double[] pol_root(double[] mass){
        double q,r,phi;
        double A[] = new double[3];
        q = 2*Math.pow(mass[1],3)/(27*Math.pow(mass[0],3)) - (mass[1]*mass[2])/(3*Math.pow(mass[0],2)) + mass[3]/mass[0];
        if(q > 0)
            r = Math.sqrt(Math.abs((3*mass[0]*mass[2] - mass[1]*mass[1])/(3*mass[0]*mass[0])));
        else
            r = -Math.sqrt(Math.abs((3*mass[0]*mass[2] - mass[1]*mass[1])/(3*mass[0]*mass[0])));

        phi = Math.acos(q/Math.pow(r,3));

        A[0] = -2*r*Math.cos(phi/3);
        A[1] = 2*r*Math.cos((3.14 - phi)/3);
        A[2] = 2*r*Math.cos((3.14 + phi)/3);

        /*System.out.println("q: " + q + " r: " + r);
        for (double i:A) {
            System.out.println(i + " ");
        }*/
        return A;

    }
}
class SwingDemo implements ActionListener {
    private JFrame jfrm;
    private JLabel jlabContents, f_labs;
    private JTextField jtf;
    private JButton jbtnChs, jbtnRef;
    private ArrayList<String> film_list;
    private ArrayList<JLabel> FILM_DISP_List;
    private JPanel labPanel;
    private JPanel butPanel;
    private int count;

    SwingDemo() {
        count = 0;
        film_list = new ArrayList<String>();
        FILM_DISP_List = new ArrayList<JLabel>();

        butPanel = new JPanel();
        labPanel = new JPanel();
        //scrollpanel = new JScrollPane(labPanel);
        labPanel.setLayout(new BoxLayout(labPanel, BoxLayout.Y_AXIS));
        butPanel.setLayout(new GridLayout(4,1,10,0));

        jfrm = new JFrame("WHATFILM");
        jtf = new JTextField(15);
        jbtnChs = new JButton("Choose one");
        jbtnRef = new JButton("Refresh");
        jlabContents = new JLabel("ДИМАС ЖОПОЛАС");
        jlabContents.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        //jfrm.setLayout(new FlowLayout());

        jfrm.setSize(350, 300);
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
                jlabContents.setText("YOU FUCKFACE");
            } else {
                int rd = 0;
                for(int i = 0;i < 3; i++)
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


public class Example {
    public static void main(String[] args) {
        System.out.print("ok");
        System.out.println(", will that bitch commit or no?");
        System.out.print("ok,everyfin is fine");
    }
}