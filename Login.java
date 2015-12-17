package abcmain;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends datasql {
 Login(String user,String pwd) throws SQLException, ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
            		String type1;	
			String strsql =  "SELECT username,password FROM logindata";
			ResultSet rset = stmt.executeQuery(strsql);
			boolean flagu = false;
                        boolean flagn = false;
			
			while(rset.next())
			{
			
				String u = rset.getString("username");
				if(u.equals(user))
				{
								
					 String p = rset.getString("password");
					if(pwd.equals(p))
					{
						JFrame frame = new JFrame();
                                                SellUsedCarForm newSellUsedCarForm = new SellUsedCarForm();
                                                frame.getContentPane().add(newSellUsedCarForm);
                                                frame.setVisible(true);
                                                frame.setSize(450, 350);
                                                newSellUsedCarForm.init();
                                                newSellUsedCarForm.start();
                                                
						flagu = true ;
						break;
					}
						
				}
                        }	
			if(flagu == false)
                        {
  
                            
                        
                            strsql =  "SELECT username,password FROM logindata1";
                            rset = stmt.executeQuery(strsql);
            	
			
                            while(rset.next())
                            {
			
                               	String u = rset.getString("username");
				if(u.equals(user))
                                {
					
					 String p = rset.getString("password");
					if(pwd.equals(p))
					{
						JFrame frame = new JFrame();
                                                SellNewCarForm newSellNewCarForm = new SellNewCarForm();
                                                frame.getContentPane().add(newSellNewCarForm);
                                                frame.setVisible(true);
                                                frame.setSize(450, 350);
                                                newSellNewCarForm.init();
                                                newSellNewCarForm.start();
                                                //
						flagn = true ;
						break;
					}
						
				}
				
			}
                        
                        }   
                      if(flagu==true)
                          type1 = "seller";
                      if(flagn == true)
                          type1 = "company";
                      if(flagn==false && flagu==false)
                          JOptionPane.showMessageDialog(null,"Incorrect Username or Password.\nPlease Try again.");
                                
 
      }


}

