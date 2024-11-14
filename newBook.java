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



public class newBook extends javax.swing.JFrame {

    /**
     * Creates new form newBook
     */
    public newBook() {
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
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 91, 70, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 131, 74, -1));

        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 171, 70, -1));

        jLabel4.setText("Publisher Year");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 211, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 88, 200, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 128, 200, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 168, 200, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 208, 200, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-20.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 258, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-20.png"))); // NOI18N
        jButton2.setText("Close");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 258, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg image.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String bookID = jTextField1.getText();
        String name = jTextField2.getText();
        String publisher = jTextField3.getText();
        String publisherYear = jTextField4.getText();
        
          // Validation: Check if any field is empty
    if (bookID.isEmpty() || name.isEmpty() || publisher.isEmpty() || publisherYear.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further processing
    }
    
    // Validation for Book ID: Check if it contains only numbers (0-9)
    if (!bookID.matches("\\d+")) { // Only digits
        JOptionPane.showMessageDialog(this, "Book ID must contain only numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further processing
    }
    
    // Validation for Publisher Year: Check if it contains only numbers (0-9)
    if (!publisherYear.matches("\\d+")) { // Only digits
        JOptionPane.showMessageDialog(this, "Publisher Year must contain only numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further processing
    }
    
    // Validation for Name: Check if it contains only letters (A-Z, a-z)
    if (!name.matches("[a-zA-Z]+")) { // Only letters
        JOptionPane.showMessageDialog(this, "Name must contain only letters!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further processing
    }
        
        try {
           //Use  filewriter to write data to a text file
           FileWriter writer = new FileWriter("books.txt", true); // 'true' to append to the file
            writer.write("Book ID: " + bookID + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Publisher: " + publisher + "\n");
            writer.write("Publication Year: " + publisherYear + "\n");
            writer.write("----------------------------\n");
            writer.close();
            
            // Notify the user
            JOptionPane.showMessageDialog(this, "Book details saved successfully!");

        } catch (IOException e) {
            // Handle the exception if there's an error writing to the file
            JOptionPane.showMessageDialog(this, "An error occurred while saving book details.");
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}