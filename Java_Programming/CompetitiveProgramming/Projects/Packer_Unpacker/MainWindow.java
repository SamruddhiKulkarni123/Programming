import javax.swing.*;
import java.awt.event.*;

class MainWindow
{
    public static void main(String Args[])
    {
        JFrame fobj = new JFrame("File Packer-Unpacker");
        JButton pobj = new JButton("Pack");
        JButton uobj = new JButton("UnPack");

        pobj.setBounds(50,100,150,50);

        pobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                new PackWindow();
            }
        });

        uobj.setBounds(200,100,150,50);

        uobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                new UnPackWindow();
            }
        });

        fobj.setLayout(null);

        fobj.add(pobj);
        fobj.add(uobj);

        fobj.setSize(400,300);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fobj.setVisible(true);

    
    }
}