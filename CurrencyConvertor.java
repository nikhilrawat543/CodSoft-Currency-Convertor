import javax.swing.*;
import java.awt.event.*;

public class CurrencyConvertor
{
    public static void Convertor()
    {
        JFrame val = new JFrame("CURRENCY CONVERTOR");

        JLabel Jl1, Jl2;

        JTextField Jt1, Jt2;

        JButton But1, But2, But3;

        Jl1 = new JLabel("Rupees : ");
        Jl1.setBounds(20,40,100,30);

        Jl2 = new JLabel("Dollars : ");
        Jl2.setBounds(170,40,100,30);

        Jt1 = new JTextField("0");
        Jt1.setBounds(80,40,50,30);

        Jt2 = new JTextField("0");
        Jt2.setBounds(240,40,50,30);

        But1 = new JButton("INR");
        But1.setBounds(50,80,100,15);

        But2 = new JButton("Dollar");
        But2.setBounds(190,80,100,15);

        But3 = new JButton("Close");
        But3.setBounds(150,150,160,30);

        But2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double d1 = Double.parseDouble(Jt1.getText());

                double dans1 = (d1 / 83.35);

                String str1 = String.valueOf(dans1);

                Jt2.setText(str1);
            }
        });

        But1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double d2 = Double.parseDouble(Jt2.getText());

                double dans2 = (d2 * 83.35);

                String str2 = String.valueOf(dans2);
                
                Jt1.setText(str2);
            }
        });

        But3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                val.dispose();
            }
        });

        val.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        val.add(Jl1);
        val.add(Jt1);
        val.add(Jl2);
        val.add(Jt2);
        val.add(But1);
        val.add(But2);
        val.add(But3);

        val.setLayout(null);
        val.setSize(400,300);
        val.setVisible(true);
    }

    public static void main(String args[])
    {
        Convertor();
    }
}
