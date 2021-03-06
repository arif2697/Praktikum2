/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dosen.gui;

import com.app.dosen.entity.Mahasiswa;
import com.app.dosen.entity.Mahasiswa;
import com.app.dosen.model.MahasiswaTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arief
 */
public class Aplikasidatamahasiswa extends javax.swing.JFrame {
    private MahasiswaTableModel model;
    private List<Mahasiswa> listData;
   

    /**
     * Creates new form Aplikasidatamahasiswa
     */
    public Aplikasidatamahasiswa() {
        initComponents();
        setLocationRelativeTo(this);
        initData();
        model = new MahasiswaTableModel(listData);
        tablemahasiswa.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablemahasiswa = new javax.swing.JTable();
        buttontambah = new javax.swing.JButton();
        buttonubah = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        buttonkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Mahasiswa");

        tablemahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablemahasiswa.setRowHeight(24);
        tablemahasiswa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablemahasiswa.getTableHeader().setResizingAllowed(false);
        tablemahasiswa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablemahasiswa);

        buttontambah.setText("Tambah");

        buttonubah.setText("Ubah");

        buttonhapus.setText("Hapus");

        buttonkeluar.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttontambah)
                .addGap(26, 26, 26)
                .addComponent(buttonubah, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonkeluar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttontambah)
                    .addComponent(buttonubah)
                    .addComponent(buttonhapus)
                    .addComponent(buttonkeluar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Aplikasidatamahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikasidatamahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikasidatamahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasidatamahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasidatamahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonkeluar;
    private javax.swing.JButton buttontambah;
    private javax.swing.JButton buttonubah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemahasiswa;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        listData=new ArrayList<>();
        Mahasiswa mahasiswa = new Mahasiswa(
                "43A87006180195", "Andri Rama",
                "Teknik Informatika", "Kartini ,Bekasi",
                "andri@gmail.com","0897758940");
        listData.add(mahasiswa);
       mahasiswa = new Mahasiswa(
                "43A87006180565", "Ali Ramadhan",
                "Teknik Informatika", "Tambun ,Bekasi",
                "aliss@gmail.com","0897658940");
        listData.add(mahasiswa);
        mahasiswa = new Mahasiswa(
                "43A87006160945", "Dini Rahmadini",
                "Teknik Informatika", "Tambun ,Bekasi",
                "Dini@gmail.com","0837656930");
        listData.add(mahasiswa);
        mahasiswa = new Mahasiswa(
                "43A87006180555", "Rani Suryani",
                "Teknik Informatika", "Tambun ,Bekasi",
                "Rayniee@gmail.com","0836758990");
        listData.add(mahasiswa);
 
    
    
    
    }
}
