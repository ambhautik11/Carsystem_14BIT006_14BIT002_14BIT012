/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcmain;

 
import static abcmain.datasql.stmt;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
 
public class TableUsed_Cars extends JFrame
{
    public TableUsed_Cars() throws SQLException, ClassNotFoundException
    {
        count c = new count();
        int count = c.countUsed();
        //headers for the table
        String[] columns = new String[] {
           "Seller", "Company", "Model", "Price", "Contact"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[count][5]; 
 
        String strsql =  "SELECT * FROM usedcar";
			ResultSet rset = stmt.executeQuery(strsql);
        int i =0;                
        while(rset.next())
        {
            data[i][0] = rset.getString("seller");
            data[i][1] = rset.getString("company");
            data[i][2] = rset.getString("model");
            data[i][3] = rset.getString("price");
            data[i][4] = rset.getString("contact");
            i++;  
            
        }
        
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Used Car");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    /*public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableExample();
            }
        });
    }  */
}

