/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcmain;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gryffin
 */
public class SignUpForm extends javax.swing.JApplet {

    /**
     * Initializes the applet SignUpForm
     */
    String username,password,password1,password2;
    char[] p1,p2 ;
    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        getContentPane().setBackground(Color.DARK_GRAY);
        this.setSize(550, 350);

        /* Create and display the applet */
        /*
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
        run();
    }
    public void run() {
                    initComponents();
                }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpFormLabel = new javax.swing.JLabel();
        DetailsLabel = new javax.swing.JLabel();
        TypeQuery = new javax.swing.JLabel();
        UsernameQuery = new javax.swing.JLabel();
        UsernameEntry = new javax.swing.JTextField();
        Pass1 = new javax.swing.JLabel();
        Pass2 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JPasswordField();
        pwd2 = new javax.swing.JPasswordField();
        SubmitCompany = new javax.swing.JToggleButton();
        SubmitPrivate = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUpFormLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SignUpFormLabel.setForeground(new java.awt.Color(255, 0, 0));
        SignUpFormLabel.setText("Sign Up here.");
        getContentPane().add(SignUpFormLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        DetailsLabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        DetailsLabel.setForeground(new java.awt.Color(255, 153, 153));
        DetailsLabel.setText("Fill Up the Details Here");
        getContentPane().add(DetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, -1));

        TypeQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TypeQuery.setForeground(new java.awt.Color(255, 255, 255));
        TypeQuery.setText("Are You Representing a Company OR are you a Private Customer?");
        TypeQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TypeQueryMouseClicked(evt);
            }
        });
        getContentPane().add(TypeQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        UsernameQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameQuery.setForeground(new java.awt.Color(255, 255, 255));
        UsernameQuery.setText("Enter Username");
        getContentPane().add(UsernameQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        UsernameEntry.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                UsernameEntered(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        getContentPane().add(UsernameEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 116, -1));

        Pass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pass1.setForeground(new java.awt.Color(255, 255, 255));
        Pass1.setText("Enter a New Password");
        getContentPane().add(Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Pass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pass2.setForeground(new java.awt.Color(255, 255, 255));
        Pass2.setText("Re-Type Password");
        getContentPane().add(Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        pwd1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                PasswordEntered(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        getContentPane().add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 157, -1));
        getContentPane().add(pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 157, -1));

        SubmitCompany.setBackground(new java.awt.Color(204, 204, 204));
        SubmitCompany.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        SubmitCompany.setText("Submit as a Company");
        SubmitCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubCom(evt);
            }
        });
        SubmitCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitCompanyActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        SubmitPrivate.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        SubmitPrivate.setText("Submit as a Private User");
        SubmitPrivate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubPri(evt);
            }
        });
        getContentPane().add(SubmitPrivate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameEntered(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_UsernameEntered
        // TODO add your handling code here:
        
        //KAUMIL - Input Username
    }//GEN-LAST:event_UsernameEntered

    private void PasswordEntered(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PasswordEntered
        // TODO add your handling code here:
        
        //KAUMIL - Check with Retype Password
        //If same, then store else throw error
    }//GEN-LAST:event_PasswordEntered

    private void SubCom(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubCom
        // TODO add your handling code here:
        p1 = pwd1.getPassword();
        password1 = new String(p1);
        p2 = pwd2.getPassword();
        password2 = new String(p2);
       
        if(UsernameEntry.getText().equals("") || password1.equals("") || password2.equals(""))
        {
            JOptionPane.showMessageDialog(this, "You cannot leave a field empty!");
        }
        else if(!password1.equals(password2))
        {
            JOptionPane.showMessageDialog(this, "your password should be match.!");
        }
        else
        {
              username =  UsernameEntry.getText();
              password = new String(p1);
            try {
                  register register = new register(username,password,2);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JFrame frame = new JFrame();
            Registration newEntry = new Registration();
            frame.getContentPane().add(newEntry);
            frame.setVisible(true);
            frame.setSize(450, 350);
            newEntry.init();
            newEntry.start();
        }
    }//GEN-LAST:event_SubCom

    private void SubPri(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubPri
        // TODO add your handling code here:
         p1 = pwd1.getPassword();
        password1 = new String(p1);
        p2 = pwd2.getPassword();
        password2 = new String(p2);
         if(UsernameEntry.getText().equals("") || password1.equals("") || password2.equals(""))
        {
            JOptionPane.showMessageDialog(this, "You cannot leave a field empty!");
        }
        else if(!password1.equals(password2))
        {
            JOptionPane.showMessageDialog(this, "your password should be match.!");
        }
        else
        {
            username =  UsernameEntry.getText();
            password = new String(p1);
            try {
                register register = new register(username,password,1);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JFrame frame = new JFrame();
            Registration newEntry = new Registration();
            frame.getContentPane().add(newEntry);
            frame.setVisible(true);
            frame.setSize(450, 350);
            newEntry.init();
            newEntry.start();
        }
        

      
    
    }//GEN-LAST:event_SubPri

    private void TypeQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TypeQueryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeQueryMouseClicked

    private void SubmitCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DetailsLabel;
    private javax.swing.JLabel Pass1;
    private javax.swing.JLabel Pass2;
    private javax.swing.JLabel SignUpFormLabel;
    protected javax.swing.JToggleButton SubmitCompany;
    protected javax.swing.JToggleButton SubmitPrivate;
    private javax.swing.JLabel TypeQuery;
    private javax.swing.JTextField UsernameEntry;
    private javax.swing.JLabel UsernameQuery;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    // End of variables declaration//GEN-END:variables
}
