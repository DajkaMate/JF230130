/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enter.Enter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author steyza
 */
public class Uj_Felhasznalo extends javax.swing.JFrame {
    static Integer Allapot=null;
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String Nevellenorzes=null;
    /**
     * Creates new form Uj_Felhasznalo
     */
    public Uj_Felhasznalo() {
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

        jLabel_Nev = new javax.swing.JLabel();
        jLabel_Jelszo = new javax.swing.JLabel();
        jTextField_Nev = new javax.swing.JTextField();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jLabel_Jelszo_ism = new javax.swing.JLabel();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jButton_Jovahagy = new javax.swing.JButton();
        jButton_Vissza = new javax.swing.JButton();
        jCheckBox_1 = new javax.swing.JCheckBox();
        jLabel_Info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nev.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Nev.setText("Név:");

        jLabel_Jelszo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Jelszo.setText("Jelszó:");

        jTextField_Nev.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPasswordField_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel_Jelszo_ism.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Jelszo_ism.setText("Jelszó ismétlés:");

        jPasswordField_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton_Jovahagy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Jovahagy.setText("Felvétel");
        jButton_Jovahagy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JovahagyActionPerformed(evt);
            }
        });

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jCheckBox_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox_1.setText("Rendszergazda");

        jLabel_Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Info.setText("Info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Jelszo)
                                    .addComponent(jLabel_Nev))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Nev)
                                    .addComponent(jPasswordField_1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Jelszo_ism)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField_2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton_Jovahagy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(jButton_Vissza, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox_1)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nev))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Jelszo))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Jelszo_ism)
                    .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Jovahagy)
                    .addComponent(jButton_Vissza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void jButton_JovahagyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JovahagyActionPerformed
        // Most azt a variációt készítjük el, amikor is a beírás után ellenőrzünk
        jLabel_Info.setText("");
        boolean ok =true;
        for (int i=0; i<jTextField_Nev.getText().length(); i++) //végigszaladunk a bevitt névmezőn
        {
            char ellenorzes=jTextField_Nev.getText().charAt(i); // egyesével ellenőrizzük a karaktert
            if (ellenorzes==' ')
            {
                ok=false;
                jLabel_Info.setText("Ne hagyjon space karaktert!");
            }
        }
        if (ok)
        {
            if (jTextField_Nev.getText().equals("") || jPasswordField_1.getText().equals(""))
            {
                jLabel_Info.setText("Ne hagyjon üres mezőket!");
                ok=false;
            }
            else if (!(jPasswordField_1.getText().equals(jPasswordField_2.getText())))
            {
                jLabel_Info.setText("Jelszó megerősítés nem megfelelő!");
                ok=false;
            }
            else //nézzük meg, hogy ez a név szerepel-e, mert ha igen, akkor ok=false;
            {
                String sql = "SELECT F_nev FROM Felh WHERE F_nev = '"+ jTextField_Nev.getText() +"'";
                try
                {
                    conn = MYSQL_kapcs.ConnectDB();
                    
                    Statement sta=conn.createStatement();
                    ResultSet rs=sta.executeQuery(sql);
                    if (rs.next())
                    {
                        Nevellenorzes=rs.getString("F_nev");
                        jLabel_Info.setText("Ez a név már szerepel");
                        ok=false;
                    }
                    sta.close();
                    rs.close();
                    conn.close();
                }
                
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            } 
        }
        //if ok -> lehet insert-elni !!! ne feljtsük a checkbox-ot  
        if (ok)
        {
            try
            {
                int jog=0;
                if (jCheckBox_1.isSelected()) // check box beállítva-e
                {
                    jog=1;
                }
                conn=MYSQL_kapcs.ConnectDB();
                String sql="INSERT INTO Felh (F_nev, F_jelsz, F_tip) VALUES"
                        +"('"+jTextField_Nev.getText()+"',"
                        +"'"+jPasswordField_1.getText()+"',"
                        +jog+")";
                Statement sta=conn.createStatement();
                sta.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Insert megtörtént!");
                sta.close();
                conn.close();
                this.dispose();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Sikertelen felvétel: "+e);
            }
        }
    }//GEN-LAST:event_jButton_JovahagyActionPerformed

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
            java.util.logging.Logger.getLogger(Uj_Felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uj_Felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uj_Felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uj_Felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uj_Felhasznalo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Jovahagy;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JCheckBox jCheckBox_1;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Jelszo;
    private javax.swing.JLabel jLabel_Jelszo_ism;
    private javax.swing.JLabel jLabel_Nev;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JTextField jTextField_Nev;
    // End of variables declaration//GEN-END:variables
}
