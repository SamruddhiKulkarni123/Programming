import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class PackWindow
{
    PackWindow()
    {
        JFrame fobj = new JFrame("File Packer");
        JButton pobj = new JButton("Pack");
        JLabel lobj1 = new JLabel("FolderName");
        JLabel lobj2 = new JLabel("PackFileName");
        JTextField tobj1 = new JTextField();
        JTextField tobj2 = new JTextField();

        pobj.setBounds(80,120,150,50);

        lobj1.setBounds(50,30,90,30);
        tobj1.setBounds(150,30,90,30);

        lobj2.setBounds(50,70,90,30);
        tobj2.setBounds(150,70,90,30);

        pobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                String FolderName = tobj1.getText();
                String PackFileName = tobj2.getText();

                try
                {
                    Pack(FolderName, PackFileName);
                    JOptionPane.showMessageDialog(fobj, "Files packed successfully");
                }
                catch(IOException e)
                {
                    JOptionPane.showMessageDialog(fobj, "Error: " + e.getMessage());
                }
            }
        });


        fobj.setLayout(null);

        fobj.add(pobj);
        fobj.add(lobj1);
        fobj.add(lobj2);
        fobj.add(tobj1);
        fobj.add(tobj2);

        fobj.setSize(400,300);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fobj.setVisible(true);
    
    }

    void Pack(String FolderName, String PackFileName) throws IOException
    {
        int iRet = 0;
        int size = 0;
        int i = 0, j = 0;

        String header = "";

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        byte Buffer[] = new byte[1024];
        byte bHeader[] = null;

        File fobjfolder = new File(FolderName);


        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();                   // pack file gets createdc

            foobj = new FileOutputStream(fobjpack);


            File fArr[] = fobjfolder.listFiles();


            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                header = header + fArr[i].getName();
                header = header + " ";
                header = header + fArr[i].length();


                size = 100 - header.length();

                for(j = 1; j <= size; j++)
                {
                    header = header + " ";
                }

                bHeader = header.getBytes();

                // Header encryption
                Encrypt(bHeader, bHeader.length, 3);
                
                // Write file name and size

                foobj.write(bHeader);
                

                // Loop to read from fiobj and write to foobj

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    // Data encryption
                    Encrypt(Buffer, iRet, 3);
                    foobj.write(Buffer, 0, iRet);

                }
                
                fiobj.close();
                header = "";
    
            }
            foobj.close();
            
        }
        else
        {
            throw new FileNotFoundException("There is no such folder");
        }

    }

    static void Encrypt(byte data[], int length, int key)
    {
        for(int i = 0; i < length; i++)
        {
            data[i] = (byte)(data[i] + key); 
        }
    }


}