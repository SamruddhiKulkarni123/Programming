import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class UnPackWindow
{
    UnPackWindow()
    {
        JFrame fobj = new JFrame("File UnPacker");
        JButton uobj = new JButton("UnPack");
        JLabel lobj = new JLabel("PackedFileName");
        JTextField tobj = new JTextField();

        uobj.setBounds(100,100,150,50);

        lobj.setBounds(50,30,120,30);
        tobj.setBounds(150,30,120,30);

        uobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                String PackedFileName = tobj.getText();

                try
                {
                    UnPack(PackedFileName);
                    JOptionPane.showMessageDialog(fobj, "Files Unpacked successfully");
                }
                catch(IOException e)
                {
                    JOptionPane.showMessageDialog(fobj, "Error: " + e.getMessage());
                }
            }
        });

        fobj.setLayout(null);

        fobj.add(uobj);
        fobj.add(lobj);
        fobj.add(tobj);

        fobj.setSize(400,300);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fobj.setVisible(true);

    
    }
 
    void UnPack(String PackFileName) throws IOException
    {
        int iRet = 0;
        
        File fpackobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Header[] = new byte[100];
        String strHeader = null;
        File NewFile = null;
        byte Buffer[] = null;

        fpackobj = new File(PackFileName);


        if(fpackobj.exists())
        {
            fiobj = new FileInputStream(fpackobj);
            
            // read header
            while((iRet = fiobj.read(Header,0,100)) != -1)
            {
                Decrypt(Header, iRet, 3);       // Header decryption

                strHeader = new String(Header).trim();

                int pos = strHeader.lastIndexOf(' ');

                String name = strHeader.substring(0, pos);

                int size = Integer.parseInt(strHeader.substring(pos+1));

                NewFile = new File(name);
                NewFile.createNewFile();

                foobj = new FileOutputStream(NewFile);

                Buffer = new byte[size];

                // read data
                fiobj.read(Buffer,0,size);

                //Decrypt the data
                Decrypt(Buffer,size, 3);

                //write data
                foobj.write(Buffer, 0, size);
                foobj.close();
            }

            fiobj.close();

        }
        else
        {
            throw new FileNotFoundException("There is no such pack file");
        }


    }

    static void Decrypt(byte data[],int length, int key)
    {
        for(int i = 0; i < length; i++)
        {
            data[i] = (byte)(data[i] - key);
        }
    }

}