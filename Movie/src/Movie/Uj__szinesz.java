/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dajka.mate
 */
public class Uj__szinesz extends javax.swing.JFrame {
    static Integer Allapot=null;
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String Nevellenorzes_evellenorzes=null;
    static String nev=null;
    static String cim=null;
    
    public Uj__szinesz() {
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
        jTextField_nev = new javax.swing.JTextField();
        jTextField_cim = new javax.swing.JTextField();
        jButton_rogzit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Név");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cím");

        jTextField_nev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_cim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_rogzit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_rogzit.setText("Rögzít");
        jButton_rogzit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rogzitActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Vissza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nev, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jTextField_cim)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton_rogzit)
                        .addGap(61, 61, 61)
                        .addComponent(jButton2)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_cim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_rogzit)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_rogzitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rogzitActionPerformed
        boolean ok=true;
        if (jTextField_nev.getText().equals("") || jTextField_cim.getText().equals(""))
        {
          ok=false;
          JOptionPane.showMessageDialog(rootPane, "Ne hagyjon üres mezőt!");
        }
        if (ok)
        {
            if (jTextField_nev.getText().length()>50)
            {
                ok=false;
                JOptionPane.showMessageDialog(null, "Túl hosszú a név!");
            }
        }
        if (ok)
        {
            try
            {    
                int darab=0;
                conn=MySQL.ConnectDB();
                Statement sta=conn.createStatement();
                String sql="Select count(*) as darab from Szineszek where Szineszek.nev='"+jTextField_nev.getText()+"'";
                ResultSet rs=sta.executeQuery(sql);
                if (rs.next())
                {
                    darab=Integer.parseInt(rs.getString("darab"));
                    if (darab>0)
                    {
                        ok=false;
                        JOptionPane.showMessageDialog(null, "Ez a név már szerepel!");
                    }       
                }
                rs.close();
                sta.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Sikertelen lekérdezés!"+e);
            }
            if (ok)
            {
                try
                {
                    conn=MySQL.ConnectDB();
                    Statement sta=conn.createStatement();
                    String sql="Insert into Szineszek (nev,cim) "+" Values('"+jTextField_nev.getText()+"',"+jTextField_cim.getText()+"') ";
                    sta.executeUpdate(sql);
                    sta.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Sikertelen beszúrás!"+e);
                }
            }
        }
        jTextField_nev.setText("");
        jTextField_cim.setText("");
    }//GEN-LAST:event_jButton_rogzitActionPerformed

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
            java.util.logging.Logger.getLogger(Uj__szinesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uj__szinesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uj__szinesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uj__szinesz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uj__szinesz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_rogzit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_cim;
    private javax.swing.JTextField jTextField_nev;
    // End of variables declaration//GEN-END:variables
}
