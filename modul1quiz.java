
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adinda puspitasari
 */
public class modul1quiz extends javax.swing.JFrame {

    /**
     * Creates new form modul1quiz
     */
    public modul1quiz() {
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
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        jenisPesanan = new javax.swing.JLabel();
        jenisKopi = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        ePesanan = new javax.swing.JTextField();
        eKopi = new javax.swing.JComboBox<>();
        labelJumlah = new javax.swing.JLabel();
        eHarga = new javax.swing.JTextField();
        eJumlah = new javax.swing.JTextField();
        eTotal = new javax.swing.JTextField();
        buttonTotal = new javax.swing.JButton();
        labelBayar = new javax.swing.JLabel();
        eBayar = new javax.swing.JTextField();
        labelKembalian = new javax.swing.JLabel();
        eKembalian = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HISTORIA CAFE`s");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 70));

        labelHarga.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        labelHarga.setText("Harga");
        getContentPane().add(labelHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jenisPesanan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jenisPesanan.setText("Jenis Pesanan");
        getContentPane().add(jenisPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jenisKopi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jenisKopi.setText("Jenis Kopi");
        getContentPane().add(jenisKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        labelTotal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        labelTotal.setText("Total");
        getContentPane().add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        getContentPane().add(ePesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, -1));

        eKopi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JENIS KOPI", "CAPPUCCINO", "AMERICANO", "ESPRESSO", "MACCHIATO", "MOCHA" }));
        eKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eKopiActionPerformed(evt);
            }
        });
        getContentPane().add(eKopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, -1));

        labelJumlah.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        labelJumlah.setText("Jumlah Pesanan");
        getContentPane().add(labelJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(eHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, -1));

        eJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(eJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, -1));
        getContentPane().add(eTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, -1));

        buttonTotal.setText("TOTAL");
        buttonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTotalActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        labelBayar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        labelBayar.setText("Uang Bayar");
        getContentPane().add(labelBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        getContentPane().add(eBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 150, -1));

        labelKembalian.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        labelKembalian.setText("Kembalian");
        getContentPane().add(labelKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        getContentPane().add(eKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 150, -1));

        buttonSimpan.setText("SIMPAN");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        buttonReset.setText("RESET");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        getContentPane().add(buttonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        buttonKeluar.setText("KELUAR");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        backGround.setBackground(new java.awt.Color(255, 153, 153));
        backGround.setForeground(new java.awt.Color(255, 204, 204));
        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg (1).jpg"))); // NOI18N
        getContentPane().add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 501));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        double harga, bayar, hasil;
            harga = Double.parseDouble(eTotal.getText());
            bayar = Double.parseDouble(eBayar.getText());
            hasil = bayar - harga;
            eKembalian.setText(String.valueOf(hasil));
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void eKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eKopiActionPerformed
        switch (eKopi.getSelectedIndex()){
            case 1:
            {
                ePesanan.setText(String.valueOf("CAPPUCCINO"));
                eHarga.setText(String.valueOf("12000"));
            }
            break;
            case 2:
            {
                ePesanan.setText(String.valueOf("AMERICANO"));
                eHarga.setText(String.valueOf("12000"));
                
            }
            break;
            case 3:
            {
                ePesanan.setText(String.valueOf("ESPRESSO"));
                eHarga.setText(String.valueOf("10000"));
            }
            break;
            case 4:
            {
                ePesanan.setText(String.valueOf("MACCHIATO"));
                eHarga.setText(String.valueOf("15000"));
            }
            break;
            case 5:
            {
                ePesanan.setText(String.valueOf("MOCHA"));
                eHarga.setText(String.valueOf("10000"));
            }
            break;
     }
    }//GEN-LAST:event_eKopiActionPerformed

    private void buttonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTotalActionPerformed
        double harga, jumlah, total;
            harga = Double.parseDouble(eHarga.getText());
            jumlah = Double.parseDouble(eJumlah.getText());
            total = harga * jumlah;
            eTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_buttonTotalActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        eKopi.setSelectedIndex(0);
        ePesanan.setText(" ");
        eHarga.setText(" ");
        eJumlah.setText(" ");
        eTotal.setText(" ");
        eBayar.setText(" ");
        eKembalian.setText(" ");
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        JOptionPane.showMessageDialog(null, "Thank You");
        System.exit(0);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void eJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eJumlahActionPerformed

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
            java.util.logging.Logger.getLogger(modul1quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul1quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul1quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul1quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul1quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTotal;
    private javax.swing.JTextField eBayar;
    private javax.swing.JTextField eHarga;
    private javax.swing.JTextField eJumlah;
    private javax.swing.JTextField eKembalian;
    private javax.swing.JComboBox<String> eKopi;
    private javax.swing.JTextField ePesanan;
    private javax.swing.JTextField eTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jenisKopi;
    private javax.swing.JLabel jenisPesanan;
    private javax.swing.JLabel labelBayar;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelKembalian;
    private javax.swing.JLabel labelTotal;
    // End of variables declaration//GEN-END:variables
}
