import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyActionListenerforsave2 implements ActionListener {
    MyFrameAWT f;
    public MyActionListenerforsave2(MyFrameAWT f)
    {
        this.f=f;
    }
    public void actionPerformed(ActionEvent e){
     
     try
      {
        Personne personne=new Personne();
        FileOutputStream os = new FileOutputStream("personne.ser");
        ObjectOutputStream oos=new ObjectOutputStream(os);
        
         oos.writeObject(personne);
         os.close();
         f.ta.setText("object saved!!!");

      } 
      catch(FileNotFoundException e2){System.out.println(e2);}
      catch(IOException e3){System.out.println(e3);}
  
    }
    
    
}
