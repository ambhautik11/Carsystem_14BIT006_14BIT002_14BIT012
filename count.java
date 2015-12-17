/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcmain;

import static abcmain.datasql.stmt;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bhaut!k
 */
public class count {
   int countNew() throws SQLException, ClassNotFoundException
    {
        int count =0;
       datasql datasql = new datasql();
        String strsql =  "SELECT company FROM newcar";
			ResultSet rset = stmt.executeQuery(strsql);
        while(rset.next())
        {
            count++;
        }
        //System.out.print(count);
       return count;
    }
   int countUsed() throws SQLException, ClassNotFoundException
    {
        int count =0;
       datasql datasql = new datasql();
        String strsql =  "SELECT company FROM usedcar";
			ResultSet rset = stmt.executeQuery(strsql);
        while(rset.next())
        {
            count++;
        }
        //System.out.print(count);
       return count;
    }
    
}
