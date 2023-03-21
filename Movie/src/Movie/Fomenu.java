/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

public class Fomenu extends javax.swing.JFrame {

    public Fomenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Karbantartas = new javax.swing.JMenu();
        jMenuItem_Ujfilm = new javax.swing.JMenuItem();
        jMenuItem_filmmodosit = new javax.swing.JMenuItem();
        jMenuItem_Ujszinesz = new javax.swing.JMenuItem();
        jMenuItem_szineszmodositas = new javax.swing.JMenuItem();
        jMenuItem_szerepel = new javax.swing.JMenuItem();
        jMenu_Informacio = new javax.swing.JMenu();
        jMenuItem_Lekerdezesek = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu_Karbantartas.setText("Karbantartas");

        jMenuItem_Ujfilm.setText("Új_film");
        jMenuItem_Ujfilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UjfilmActionPerformed(evt);
            }
        });
        jMenu_Karbantartas.add(jMenuItem_Ujfilm);

        jMenuItem_filmmodosit.setText("Film Módosítás");
        jMenu_Karbantartas.add(jMenuItem_filmmodosit);

        jMenuItem_Ujszinesz.setText("Új színész");
        jMenuItem_Ujszinesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UjszineszActionPerformed(evt);
            }
        });
        jMenu_Karbantartas.add(jMenuItem_Ujszinesz);

        jMenuItem_szineszmodositas.setText("Színész módosítás");
        jMenu_Karbantartas.add(jMenuItem_szineszmodositas);

        jMenuItem_szerepel.setText("Szereplések");
        jMenu_Karbantartas.add(jMenuItem_szerepel);

        jMenuBar1.add(jMenu_Karbantartas);

        jMenu_Informacio.setText("Információ");

        jMenuItem_Lekerdezesek.setText("Lekerdezesek");
        jMenu_Informacio.add(jMenuItem_Lekerdezesek);

        jMenuBar1.add(jMenu_Informacio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_UjfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UjfilmActionPerformed
        Uj_film uf = new Uj_film();
        uf.setVisible(true);
    }//GEN-LAST:event_jMenuItem_UjfilmActionPerformed

    private void jMenuItem_UjszineszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UjszineszActionPerformed
        Uj__szinesz usz = new Uj__szinesz();
        usz.setVisible(true);
    }//GEN-LAST:event_jMenuItem_UjszineszActionPerformed

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
            java.util.logging.Logger.getLogger(Fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fomenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem_Lekerdezesek;
    private javax.swing.JMenuItem jMenuItem_Ujfilm;
    private javax.swing.JMenuItem jMenuItem_Ujszinesz;
    private javax.swing.JMenuItem jMenuItem_filmmodosit;
    private javax.swing.JMenuItem jMenuItem_szerepel;
    private javax.swing.JMenuItem jMenuItem_szineszmodositas;
    private javax.swing.JMenu jMenu_Informacio;
    private javax.swing.JMenu jMenu_Karbantartas;
    // End of variables declaration//GEN-END:variables
}
