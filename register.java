package abcmain;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class register extends datasql{
        
    String strsql ;
	register(String user,String pwd ,int table) throws SQLException, ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
        if(table ==1 )
	 
        {
            System.out.println(pwd + user+ table);
            strsql ="Insert INTO logindata(username,password)" + 
			 	" values('"+user +"','"+pwd+"')";
	 
                     int rset = stmt.executeUpdate(strsql);
                     JOptionPane.showMessageDialog(null, "THANK YOU FOR YOUR REGISTRATION!!  \n Your are registered as personal seller.!");
        } 
        else
        {
            strsql ="Insert INTO logindata1(username,password)" + 
			 	" values('"+user +"','"+pwd+"')";
                     int rset = stmt.executeUpdate(strsql);
                     JOptionPane.showMessageDialog(null, "THANK YOU FOR YOUR REGISTRATION !!\nYour are registered as company.!");
                     System.out.println(pwd + user+ table);
        }
    }
}
        


