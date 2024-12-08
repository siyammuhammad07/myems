
import java.io.FileWriter; 
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author siyam
 */
public class SaveJFrame extends javax.swing.JFrame {
    private MyHashTable mainHT; 


    /**
     * Creates new form SaveJFrame
     */
    public SaveJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("SAVE EMPLOYEE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
        
        
        try {
            FileWriter writer = new FileWriter("employeeinfo.txt");
            
            for(int i = 0; i< mainHT.buckets.length ; i++){
                for(int k = 0 ; k < mainHT.buckets[i].size(); k++){
                    
                    // PTE
                    if (mainHT.buckets[i].get(k) instanceof PTE){
                    writer.write(mainHT.buckets[i].get(k).empNum + "," + 
                    mainHT.buckets[i].get(k).firstName + "," + mainHT.buckets[i].get(k).lastName
                    + "," + mainHT.buckets[i].get(k).gender + "," + mainHT.buckets[i].get(k).workLoc + "," 
                    + mainHT.buckets[i].get(k).deductRate + "," + mainHT.buckets[i].get(k).getHourlyWage() + ","
                    + mainHT.buckets[i].get(k).getHoursPerWeek() + "," + mainHT.buckets[i].get(k).getWeeksPerYear() + "\n");
                    }
                    
                    //FTE
                    if (mainHT.buckets[i].get(k) instanceof FTE){
                    writer.write(mainHT.buckets[i].get(k).empNum + "," + 
                    mainHT.buckets[i].get(k).firstName + "," + mainHT.buckets[i].get(k).lastName
                    + "," + mainHT.buckets[i].get(k).gender + "," + mainHT.buckets[i].get(k).workLoc + "," + mainHT.buckets[i].get(k).deductRate +
                    "," + mainHT.buckets[i].get(k).getYearlySalary() + "\n");
                    }
                }
            
            }
            writer.close();
        } 
        
        
        
        
    
        catch (IOException ex) {
            Logger.getLogger(SaveJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SaveJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveJFrame().setVisible(true);
            }
        });
    }

    public void setMainHT(MyHashTable theRefValue){
        mainHT = theRefValue;
  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
