/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mon
 */

import java.io.IOException;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class editbookDetails extends javax.swing.JFrame {

    /**
     * Creates new form editbookDetails
     */
    public editbookDetails() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, 70, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 123, 37, -1));

        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, -1));

        jLabel4.setText("Published");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 80, 200, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 120, 200, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 160, 200, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("Guidelines for Editing Book Details\n\n\nBook ID: Enter only numeric values.\n\nName: Letters only—no numbers.\n\nPublisher: Letters only.\n\nPublisher Year: Numbers only (e.g., 2023).\n\nSave: Updates the book's information\n\nClear: Resets all fields to blank.\n\nCancel: Closes without saving any changes.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 23, 271, 283));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-clear-20.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 271, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-20.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 271, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-20.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 271, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 200, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg image.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // Clear all the text fields
    jTextField1.setText(""); // Clear Book ID field
    jTextField2.setText(""); // Clear Name field
    jTextField3.setText(""); // Clear Publisher field
    jTextField4.setText(""); // Clear Publisher Year field
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Close the form without saving any changes
    this.dispose(); // Closes the current form
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      // Retrieve input from text fields
    String bookID = jTextField1.getText();
    String name = jTextField2.getText();
    String publisher = jTextField3.getText();
    String publisherYear = jTextField4.getText();

    // Input validation
    if (!bookID.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Invalid Book ID: Must contain numbers only.");
        return;
    }
    if (!name.matches("[a-zA-Z ]+")) {
        JOptionPane.showMessageDialog(this, "Invalid Name: Must contain letters only.");
        return;
    }
    if (!publisher.matches("[a-zA-Z ]+")) {
        JOptionPane.showMessageDialog(this, "Invalid Publisher: Must contain letters only.");
        return;
    }
    if (!publisherYear.matches("\\d{4}")) {
        JOptionPane.showMessageDialog(this, "Invalid Publisher Year: Must be a 4-digit number.");
        return;
    }

    // Save the book details to the file
    try {
        FileWriter writer = new FileWriter("books.txt", true); // 'true' to append to the file
        writer.write("Book ID: " + bookID + "\n");
        writer.write("Name: " + name + "\n");
        writer.write("Publisher: " + publisher + "\n");
        writer.write("Publication Year: " + publisherYear + "\n");
        writer.write("----------------------------\n");
        writer.close();

        // Notify the user
        JOptionPane.showMessageDialog(this, "Book details updated successfully!");

    } catch (IOException e) {
        // Handle the exception if there's an error writing to the file
        JOptionPane.showMessageDialog(this, "An error occurred while saving book details.");
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(editbookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editbookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editbookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editbookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editbookDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
