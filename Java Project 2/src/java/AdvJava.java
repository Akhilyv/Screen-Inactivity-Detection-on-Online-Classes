import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdvJava implements WindowListener
{
//create a label
String a1;
Label lbl1;
//create frame
Frame fr;
AdvJava()
{
fr = new Frame("Window events demo . . .");
lbl1= new Label(" Window events will be displayed on console", Label.CENTER);

fr.setLayout(new FlowLayout()); //set the layout

fr.add(lbl1);                   //add the label to the frame

fr.addWindowListener(this);     //In order to catch as well as respond to the mouse events, register the created class JWindowListenerExample

fr.setSize(1900,1020);            //set the size of frame where width is 350 and height as 250
 
fr.setVisible(true);            //set the visibility as true

}




//implementation of windowActivated method
public void windowActivated(WindowEvent ev)
{
    System.out.println("Window is activated now");
    try
    { 
    int a=0;
    DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date obj = new Date();
    System.out.println(dfor.format(obj));
    Connection con = signin.initializeDatabase();
    PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
    //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
    st.setInt(1, 0);
    st.setString(2, "Windows-Activated");
    st.setString(3, dfor.format(obj));
    st.executeUpdate();
    st.close();
    con.close(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println(e); 
    }
    
    
}




//implementation of windowClosed method
public void windowClosed(WindowEvent ev)
{
    System.out.println("Now, the window is closed");
    try
    { 
        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        System.out.println(dfor.format(obj));
        Connection con = signin.initializeDatabase();
        PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
        //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
        st.setInt(1, 0);
        st.setString(2, "Window-Closed");
        st.setString(3, dfor.format(obj));
        st.executeUpdate();
        st.close();
        con.close(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println(e); 
    }
}




//implementation of windowClosing method
public void windowClosing(WindowEvent ev)
{
//release all the resources
fr.dispose();
    System.out.println("Window is closing now");
    try
    { 
        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        System.out.println(dfor.format(obj));
        Connection con = signin.initializeDatabase();
        PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
        //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
        st.setInt(1, 0);
        st.setString(2, "Window-Closing");
        st.setString(3, dfor.format(obj));
        st.executeUpdate();
        st.close();
        con.close(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println(e); 
    }
}






//implementation of windowDeactivated method
public void windowDeactivated(WindowEvent ev)
{
    System.out.println("Window gets Deactivated");
    try
    { 
        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        System.out.println(dfor.format(obj));
        Connection con = signin.initializeDatabase();
        PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
        //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
        st.setInt(1, 0);
        st.setString(2, "Window-Deactivated");
        st.setString(3, dfor.format(obj));
        st.executeUpdate();
        st.close();
        con.close(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println(e); 
    }
}







//implementation of windowDeiconified method
public void windowDeiconified(WindowEvent ev)
{
    System.out.println("Window gets Deiconified");
    try
    { 
        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        System.out.println(dfor.format(obj));
        Connection con = signin.initializeDatabase();
        PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
        //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
        st.setInt(1, 0);
        st.setString(2, "Window-Deiconified");
        st.setString(3, dfor.format(obj));
        st.executeUpdate();
        st.close();
        con.close(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println(e); 
    }
}






//implementation of windowIconified method
public void windowIconified(WindowEvent ev)
{
    System.out.println("Window gets minimized or iconified");
    try
    { 
        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        System.out.println(dfor.format(obj));
        Connection con = signin.initializeDatabase();
        PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
        //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
        st.setInt(1, 0);
        st.setString(2, "Window-Iconified");
        st.setString(3, dfor.format(obj));
        st.executeUpdate();
        st.close();
        con.close(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
        System.out.println(e); 
    }
}







//implementation of windowOpened method
public void windowOpened(WindowEvent e)
{
    System.out.println("The window is opening for the very first time");
    try
    { 
        DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        System.out.println(dfor.format(obj));
        Connection con = signin.initializeDatabase();
        PreparedStatement st = con.prepareStatement("insert into windowevent3 (status,action,time) values (?,?,?) ");
        //values (0,'Windows-closed','" +dfor.format(obj)+ "' ")
        st.setInt(1, 0);
        st.setString(2, "Window-Opened");
        st.setString(3, dfor.format(obj));
        st.executeUpdate();
        st.close();
        con.close(); 
    }
    catch(Exception ee)
    {
        ee.printStackTrace();
        System.out.println(e); 
    }
}




//main method
public static void main(String... ar)
{
    new AdvJava();
}
}