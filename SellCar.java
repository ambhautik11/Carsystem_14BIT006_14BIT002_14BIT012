package abcmain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.lang.*;

public class SellCar extends javax.swing.JApplet {

    
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
            java.util.logging.Logger.getLogger(SellCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        getContentPane().setBackground(Color.MAGENTA);
        this.setSize(450, 350);
        

        /* Create and display the applet */
        /*try {
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

        New_Cars = new javax.swing.JButton();
        Used_Cars = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 204));
        setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        New_Cars.setBackground(new java.awt.Color(255, 255, 255));
        New_Cars.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New_Cars.setText("Sell a New Car");
        New_Cars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellNewCar(evt);
            }
        });
        getContentPane().add(New_Cars, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 150));

        Used_Cars.setBackground(new java.awt.Color(255, 255, 255));
        Used_Cars.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Used_Cars.setText("Sell a Used Car");
        Used_Cars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellUsedCar(evt);
            }
        });
        Used_Cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Used_CarsActionPerformed(evt);
            }
        });
        getContentPane().add(Used_Cars, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, 150));
    }// </editor-fold>//GEN-END:initComponents
        
    /*String type1=null;
                    if(type1.equals("seller"))
                        New_Cars.setEnabled(false);
                    if(type1.equals("company"))
                        Used_Cars.setEnabled(false);*/
    private void SellNewCar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellNewCar
        // TODO add your handling code here:
        JFrame frame = new JFrame();
            SellNewCarForm snc = new SellNewCarForm();
            frame.getContentPane().add(snc);
            frame.setVisible(true);
            frame.setSize(450, 350);
            snc.init();
            snc.start();
    }//GEN-LAST:event_SellNewCar

    private void SellUsedCar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellUsedCar
        // TODO add your handling code here:
        JFrame frame = new JFrame();
            SellUsedCarForm suc = new SellUsedCarForm();
            frame.getContentPane().add(suc);
            frame.setVisible(true);
            frame.setSize(450, 350);
            suc.init();
            suc.start();
    }//GEN-LAST:event_SellUsedCar

    private void Used_CarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Used_CarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Used_CarsActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton New_Cars;
    private javax.swing.JButton Used_Cars;
    // End of variables declaration//GEN-END:variables
}
    