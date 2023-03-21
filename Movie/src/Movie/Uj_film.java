/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.time.*;
import java.util.Calendar;

public class Uj_film extends javax.swing.JFrame {
    static Integer Allapot=null;
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String Nevellenorzes_evellenorzes=null;
    static String nev=null;
    static String cim=null;
    static String hossz=null;
    static String mufaj=null;

    public Uj_film() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel_Filmcim = new javax.swing.JLabel();
        jLabel_ev = new javax.swing.JLabel();
        jLabel_Hossz = new javax.swing.JLabel();
        jLabel_mMufaj = new javax.swing.JLabel();
        jButton_Rogzit = new javax.swing.JButton();
        jButton_Vissza = new javax.swing.JButton();
        jTextField_Filmcim = new javax.swing.JTextField();
        jTextField_Hossz = new javax.swing.JTextField();
        jTextField_mufaj = new javax.swing.JTextField();
        jComboBox_ev = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel_Filmcim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Filmcim.setText("Filmcím:");

        jLabel_ev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_ev.setText("Év:");

        jLabel_Hossz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Hossz.setText("Hossz:");

        jLabel_mMufaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mMufaj.setText("Műfaj:");

        jButton_Rogzit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Rogzit.setText("Rögzít");
        jButton_Rogzit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RogzitActionPerformed(evt);
            }
        });

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jTextField_Filmcim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Filmcim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_FilmcimMouseClicked(evt);
            }
        });
        jTextField_Filmcim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FilmcimActionPerformed(evt);
            }
        });
        jTextField_Filmcim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FilmcimKeyTyped(evt);
            }
        });

        jTextField_Hossz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Hossz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HosszKeyTyped(evt);
            }
        });

        jTextField_mufaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_mufaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_mufajKeyTyped(evt);
            }
        });

        jComboBox_ev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_mMufaj)
                    .addComponent(jLabel_Hossz)
                    .addComponent(jLabel_ev)
                    .addComponent(jLabel_Filmcim))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_mufaj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(jTextField_Hossz, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_Rogzit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_ev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextField_Filmcim, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Vissza)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Filmcim)
                    .addComponent(jTextField_Filmcim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_ev)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox_ev)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel_Hossz))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Hossz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_mMufaj)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_mufaj, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Rogzit)
                    .addComponent(jButton_Vissza))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combofresh()
    {
        //kitörlünk mindent a combobox-ból
        jComboBox_ev.removeAllItems();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        for (int i=1900; i<=year; i++)
        {
            jComboBox_ev.addItem(Integer.toString(i));
        }
    }
    
    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        combofresh();
    }//GEN-LAST:event_formWindowOpened

    private void jButton_RogzitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RogzitActionPerformed
        boolean ok=true;
        if (jTextField_Filmcim.getText().equals("") || jTextField_Hossz.getText().equals("") || jTextField_mufaj.getText().equals(""))
        {
          ok=false;
          JOptionPane.showMessageDialog(rootPane, "Ne hagyjon üres mezőt!");
        }
        if (ok)
        {
            if (jTextField_Filmcim.getText().length()>70)
            {
                ok=false;
                JOptionPane.showMessageDialog(null, "Túl hosszú a filmcím!");
            }
        }
        if (ok)
        {
            try
            {    
                int darab=0;
                conn=MySQL.ConnectDB();
                Statement sta=conn.createStatement();
                String sql="Select count(*) as darab from Filmek where "
                        +" Filmek.filmcim='"+jTextField_Filmcim.getText()+"' AND Filmek.ev="+jComboBox_ev.getSelectedItem();
                // JOptionPane.showMessageDialog(null, sql);
                ResultSet rs=sta.executeQuery(sql);
                if (rs.next())
                {
                    darab=Integer.parseInt(rs.getString("darab"));
                    if (darab>0)
                    {
                        ok=false;
                        JOptionPane.showMessageDialog(null, "Ez a film és év párosítás már szerepel!");
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
                    String sql="Insert into Filmek (filmcim,ev,hossz,mufaj) "
                            +" Values('"+jTextField_Filmcim.getText()+"',"+jComboBox_ev.getSelectedItem()+","+jTextField_Hossz.getText()+",'"+jTextField_mufaj.getText()+"') ";
                    //JOptionPane.showMessageDialog(null, sql);
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
        jTextField_Filmcim.setText("");
        jTextField_Hossz.setText("");
        jTextField_mufaj.setText("");
        jComboBox_ev.setSelectedIndex(0);
    }//GEN-LAST:event_jButton_RogzitActionPerformed

    private void jTextField_HosszKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HosszKeyTyped
        char c= evt.getKeyChar();
        if (jTextField_Hossz.getText().equals(""))
        {
            if (((c <'1') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c <'0') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_Hossz.getText().length()>=3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_HosszKeyTyped

    private void jTextField_mufajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mufajKeyTyped
        char c= evt.getKeyChar();
        if (jTextField_mufaj.getText().equals(""))
        {
            if (((c ==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_mufaj.getText().length()>=15)
        {
            evt.consume();
        }      
    }//GEN-LAST:event_jTextField_mufajKeyTyped

    private void jTextField_FilmcimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FilmcimKeyTyped
        char c= evt.getKeyChar();
        char ch2;
        String s=jTextField_Filmcim.getText();
        int hossz=jTextField_Filmcim.getText().length();
        if (jTextField_Filmcim.getText().length()>0)
        {
            ch2=s.charAt(hossz-1);
        }
        else
        {
            ch2=c;
        }
        if (jTextField_Filmcim.getText().equals(""))
        {
            if (((c ==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c ==' ') && (ch2==' ')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        if (jTextField_Filmcim.getText().length()>=70)
        {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_jTextField_FilmcimKeyTyped

    private void jTextField_FilmcimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FilmcimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FilmcimActionPerformed

    private void jTextField_FilmcimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_FilmcimMouseClicked
        jTextField_Filmcim.setText("");
    }//GEN-LAST:event_jTextField_FilmcimMouseClicked

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
            java.util.logging.Logger.getLogger(Uj_film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uj_film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uj_film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uj_film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uj_film().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Rogzit;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JComboBox<String> jComboBox_ev;
    private javax.swing.JLabel jLabel_Filmcim;
    private javax.swing.JLabel jLabel_Hossz;
    private javax.swing.JLabel jLabel_ev;
    private javax.swing.JLabel jLabel_mMufaj;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_Filmcim;
    private javax.swing.JTextField jTextField_Hossz;
    private javax.swing.JTextField jTextField_mufaj;
    // End of variables declaration//GEN-END:variables
}
