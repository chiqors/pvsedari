/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import database.Database;
import database.detail_transaksi;
import database.detail_transaksiTableModel;
import main.sessionAlur;

/**
 *
 * @author bandi
 */
public class tambahAlurDetailTransaksiViews extends javax.swing.JInternalFrame {

    private static tambahAlurDetailTransaksiViews myInstance;

    public static tambahAlurDetailTransaksiViews getInstance() {
        if (myInstance == null) {
            myInstance = new tambahAlurDetailTransaksiViews();
        }
        return myInstance;
    }
    /**
     * Creates new form penggunaViews
     */
    public tambahAlurDetailTransaksiViews() {
        initComponents();
        txtId_transaksi.setText(sessionAlur.getAlur_id_transaksi());
    }
    
    public void tampilData(String id){
        Database db = new Database();
        detail_transaksiTableModel tabeldetailtransaksi = new detail_transaksiTableModel();
        tabeldetailtransaksi.setData(db.tampil_semua_detail_transaksi(id));
        tblDetailTransaksi.setModel(tabeldetailtransaksi);
        txtId_menu.setText("");
        txtJumlah_beli.setText("");
        txtTotal_harga.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId_menu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJumlah_beli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal_harga = new javax.swing.JTextField();
        txtId_transaksi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLanjut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetailTransaksi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        jTextField4.setText("jTextField4");

        setTitle("Tambah Alur Transaksi - Detail Transaksi");

        jLabel1.setText("Data Detail Transaksi");

        jLabel8.setText("ID Menu");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Transaksi");

        jLabel3.setText("Jumlah Beli");

        jLabel5.setText("Total Harga");

        txtId_transaksi.setEditable(false);
        txtId_transaksi.setText("0");

        jLabel6.setText("Alur Transaksi (Bagian Pertama) - Dimohon agar tidak keluar dari alur ini sampai selesai");

        jLabel7.setText("Alur Data >");

        btnLanjut.setText("Lanjut");
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });

        tblDetailTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ID Transaksi", "ID Menu", "Jumlah Beli", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tblDetailTransaksi);

        jLabel4.setText("ID");

        txtId.setEditable(false);
        txtId.setText("***");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLanjut))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId_menu)
                            .addComponent(txtJumlah_beli)
                            .addComponent(txtTotal_harga)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(txtId_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(77, 77, 77)
                        .addComponent(txtId))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJumlah_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnLanjut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        db.tambah_alur_detail_transaksi(new detail_transaksi(
                txtId.getText(),
                txtId_transaksi.getText(),
                txtId_menu.getText(),
                Integer.parseInt(txtJumlah_beli.getText()),
                Integer.parseInt(txtTotal_harga.getText())
        ));
        sessionAlur.setAlur_total_harga_menu(sessionAlur.getAlur_total_harga_menu()+Integer.parseInt(txtTotal_harga.getText()));
        tampilData(sessionAlur.getAlur_id_transaksi());
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        // TODO add your handling code here:
        tambahAlurTransaksiViews tambahalurtransaksi = tambahAlurTransaksiViews.getInstance();
        tambahalurtransaksi.pack();
        if (tambahalurtransaksi.isVisible()) {
        } else {
            getDesktopPane().add(tambahalurtransaksi);
            tambahalurtransaksi.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLanjutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanjut;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tblDetailTransaksi;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId_menu;
    private javax.swing.JTextField txtId_transaksi;
    private javax.swing.JTextField txtJumlah_beli;
    private javax.swing.JTextField txtTotal_harga;
    // End of variables declaration//GEN-END:variables
}
