import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;
//import com.jgoodies.forms.layout.*;
//import info.clearthought.layout.*;
/*
 * Created by JFormDesigner on Fri Sep 08 16:17:29 GMT-07:00 2017
 */



/**
 * @author Khang Tran
 */

public class Calculator extends JFrame {
    String temp = new String();
    char s;
    int a=0,result=0;
    int trigger=0;
    public static void main (String [] args)
    {
        Calculator cal = new Calculator();
        cal.setVisible(true);}


    public Calculator() {initComponents();
    }

    private void Num1(MouseEvent e) {
        //formattedTextField1.setText("");
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+1);
        a = Integer.parseInt(formattedTextField1.getText());


        // TODO add your code here
        }


    private void Num0(MouseEvent e) {
        //formattedTextField1.setText("");
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+0);

        a = Integer.parseInt(formattedTextField1.getText());

        // TODO add your code here
    }

    private void button5MouseClicked(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+9);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num7(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+7);


        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num4(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+4);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num8(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+8);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num5(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+5);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num2(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+2);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void AC(MouseEvent e) {
        a =0;
        formattedTextField1.setText("0");


        // TODO add your code here
    }

    private void Num9(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+9);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num6(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+6);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Num3(MouseEvent e) {
        if (a == 0) formattedTextField1.setText("");
        formattedTextField1.setText(formattedTextField1.getText()+3);

        a = Integer.parseInt(formattedTextField1.getText());
        // TODO add your code here
    }

    private void Equal(MouseEvent e) {
        if (trigger == 1) result += a;
        if (trigger == 2) result -= a;
        if (trigger == 3) result *= a;
        if (trigger == 4) result /= a;
        formattedTextField1.setText(String.valueOf(result));
        a = result;
        result = 0;
        // TODO add your code here
    }

    private void Divide(MouseEvent e) {
        formattedTextField1.setText(formattedTextField1.getText()+"÷");
        result = a;
        trigger=4;
        a = 0;
        // TODO add your code here
    }

    private void Mul(MouseEvent e) {
        formattedTextField1.setText(formattedTextField1.getText()+"×");
        result =1;
        result *= a;
        trigger=3;
        a = 0;
        // TODO add your code here
    }

    private void Add(MouseEvent e) {
        formattedTextField1.setText(formattedTextField1.getText()+"+");
        result += a;
        trigger=1;
        a = 0;
        // TODO add your code here
    }

    private void Minus(MouseEvent e) {
        formattedTextField1.setText(formattedTextField1.getText()+"-");
        result = a;
        trigger=2;
        a = 0;
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Khang Tran
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        formattedTextField1 = new JFormattedTextField("0");
        formattedTextField2 = new JFormattedTextField();
        formattedTextField1.setCaretPosition(0);


        Caret blank = new DefaultCaret() {

            @Override
            public void paint(Graphics g) {
            }

            @Override
            public boolean isVisible() {
                return false;
            }

            @Override
            public boolean isSelectionVisible() {
                return false;
            }

        };
        formattedTextField1.setCaret(blank);
        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);


        //---- button1 ----
        button1.setText("7");
        button1.setFont(new Font("Georgia", Font.PLAIN, 30));
        button1.setBackground(new Color(102, 102, 255));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num7(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(0, 70, 80, 80);

        //---- button2 ----
        button2.setText("4");
        button2.setFont(new Font("Georgia", Font.PLAIN, 30));
        button2.setBackground(new Color(102, 102, 255));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num4(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(0, 155, 80, 80);

        //---- button3 ----
        button3.setText("1");
        button3.setFont(new Font("Georgia", Font.PLAIN, 30));
        button3.setBackground(new Color(102, 102, 255));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num1(e);
            }
        });
        contentPane.add(button3);
        button3.setBounds(0, 240, 80, 80);

        //---- button4 ----
        button4.setText("0");
        button4.setFont(new Font("Georgia", Font.PLAIN, 30));
        button4.setBackground(new Color(102, 102, 255));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num0(e);
            }
        });
        contentPane.add(button4);
        button4.setBounds(0, 325, 80, 80);

        //---- button5 ----
        button5.setText("8");
        button5.setFont(new Font("Georgia", Font.PLAIN, 30));
        button5.setBackground(new Color(102, 102, 255));
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num8(e);
            }
        });
        contentPane.add(button5);
        button5.setBounds(90, 70, 80, 80);

        //---- button6 ----
        button6.setText("5");
        button6.setFont(new Font("Georgia", Font.PLAIN, 30));
        button6.setBackground(new Color(102, 102, 255));
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num5(e);
            }
        });
        contentPane.add(button6);
        button6.setBounds(90, 155, 80, 80);

        //---- button7 ----
        button7.setText("2");
        button7.setFont(new Font("Georgia", Font.PLAIN, 30));
        button7.setBackground(new Color(102, 102, 255));
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num2(e);
            }
        });
        contentPane.add(button7);
        button7.setBounds(90, 240, 80, 80);

        //---- button8 ----
        button8.setText("AC");
        button8.setFont(new Font("Georgia", Font.PLAIN, 30));
        button8.setBackground(new Color(102, 102, 255));
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AC(e);
            }
        });
        contentPane.add(button8);
        button8.setBounds(90, 325, 80, 80);

        //---- button9 ----
        button9.setText("9");
        button9.setFont(new Font("Georgia", Font.PLAIN, 30));
        button9.setBackground(new Color(102, 102, 255));
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num9(e);
            }
        });
        contentPane.add(button9);
        button9.setBounds(180, 70, 80, 80);

        //---- button10 ----
        button10.setText("6");
        button10.setFont(new Font("Georgia", Font.PLAIN, 30));
        button10.setBackground(new Color(102, 102, 255));
        button10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num6(e);
            }
        });
        contentPane.add(button10);
        button10.setBounds(180, 155, 80, 80);

        //---- button11 ----
        button11.setText("3");
        button11.setFont(new Font("Georgia", Font.PLAIN, 30));
        button11.setBackground(new Color(102, 102, 255));
        button11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Num3(e);
            }
        });
        contentPane.add(button11);
        button11.setBounds(180, 240, 80, 80);

        //---- button12 ----
        button12.setText("=");
        button12.setFont(new Font("Georgia", Font.PLAIN, 30));
        button12.setBackground(new Color(102, 102, 255));
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Equal(e);
            }
        });
        contentPane.add(button12);
        button12.setBounds(180, 325, 80, 80);

        //---- button13 ----
        button13.setText("\u00f7");
        button13.setFont(new Font("Georgia", Font.PLAIN, 30));
        button13.setBackground(new Color(102, 102, 255));
        button13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Divide(e);
            }
        });
        contentPane.add(button13);
        button13.setBounds(270, 70, 80, 80);

        //---- button14 ----
        button14.setText("*");
        button14.setFont(new Font("Georgia", Font.PLAIN, 30));
        button14.setBackground(new Color(102, 102, 255));
        button14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Mul(e);
            }
        });
        contentPane.add(button14);
        button14.setBounds(270, 155, 80, 80);

        //---- button15 ----
        button15.setText("+");
        button15.setFont(new Font("Georgia", Font.PLAIN, 30));
        button15.setBackground(new Color(102, 102, 255));
        button15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Add(e);
            }
        });
        contentPane.add(button15);
        button15.setBounds(270, 240, 80, 80);

        //---- button16 ----
        button16.setText("-");
        button16.setFont(new Font("Georgia", Font.PLAIN, 30));
        button16.setBackground(new Color(102, 102, 255));
        button16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Minus(e);
            }
        });
        contentPane.add(button16);
        button16.setBounds(270, 325, 80, 80);

        //---- formattedTextField1 ----
        formattedTextField1.setBackground(SystemColor.info);
        formattedTextField1.setForeground(new Color(51, 51, 51));
        formattedTextField1.setFont(new Font("Fira Code Retina", Font.BOLD, 36));
        formattedTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(formattedTextField1);
        formattedTextField1.setBounds(0, 0, 350, 65);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Khang Tran
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
