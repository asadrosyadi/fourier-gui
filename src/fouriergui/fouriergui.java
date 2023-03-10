/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fouriergui;

import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class fouriergui extends javax.swing.JFrame {

    int jmlsinyal=0;
    int f[]={};
    int pos=1;
    double x [] = {0,1,2,3,4,5,6,7,8,9};
    double Fur [] = {0,0,0,0,0,0,0,0,0,0};
    double Fui [] = {0,0,0,0,0,0,0,0,0,0};
    
    public fouriergui() {
        initComponents();
        etInputSinyal.setEnabled(false);
        bInputSinyal.setEnabled(false);
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
        etJmlSinyal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfSinyal = new javax.swing.JLabel();
        etInputSinyal = new javax.swing.JTextField();
        bJmlSinyal = new javax.swing.JButton();
        bInputSinyal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transformasi Fourier");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Masukkan Jumlah Sinyal X :");

        jLabel3.setText("Masukkan nilai sinyal ke : ");

        tfSinyal.setText("0");

        etInputSinyal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etInputSinyalActionPerformed(evt);
            }
        });

        bJmlSinyal.setText("OK");
        bJmlSinyal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJmlSinyalActionPerformed(evt);
            }
        });

        bInputSinyal.setText("OK");
        bInputSinyal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInputSinyalActionPerformed(evt);
            }
        });

        tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "f(x)", "f(u)"
            }
        ));
        jScrollPane1.setViewportView(tabel2);

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "f(x)", "f(u)"
            }
        ));
        jScrollPane2.setViewportView(tabel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sinyal Transformasi Fourier");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("M. As'ad Rosyadi");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fouriergui/TIFourier.jpg"))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fouriergui/TFourier.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Inverse Sinyal Transformasi Fourier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etJmlSinyal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bJmlSinyal)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSinyal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etInputSinyal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bInputSinyal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(248, 248, 248))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(225, 225, 225))))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etJmlSinyal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bJmlSinyal)
                    .addComponent(jLabel3)
                    .addComponent(tfSinyal)
                    .addComponent(etInputSinyal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInputSinyal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etInputSinyalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etInputSinyalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etInputSinyalActionPerformed

    private void bJmlSinyalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJmlSinyalActionPerformed
        jmlsinyal = Integer.parseInt(etJmlSinyal.getText());
        System.out.println(jmlsinyal);
        etInputSinyal.setEnabled(true);
        bInputSinyal.setEnabled(true);
        bJmlSinyal.setEnabled(false);
        etJmlSinyal.setEnabled(false);
//        int x[] =new int[jmlsinyal];
//        System.out.println(x.length);
        tfSinyal.setText(String.valueOf(pos));
        System.out.println(pos);
    }//GEN-LAST:event_bJmlSinyalActionPerformed
    public void trans_fourier(){
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
        for(int i=0;i<f.length;i++){
                double fr=0;
                double fi=0;
                double fa=0;
                    for(int j=0;j<f.length;j++){
                        fr=fr+f[j]*Math.cos(2*Math.PI*i*x[j]/f.length);
                        fi=fi+f[j]*Math.sin(2*Math.PI*i*x[j]/f.length);
                        fa=Math.pow(Math.pow(fr, 2)+Math.pow(fi, 2), 0.5);
                    }
                    Fur[i]=fr;
                    Fui[i]=fi;
                model.addRow(new Object[]{i,f[i],fa/f.length });
                System.out.println("fa["+i+"] = "+fa/f.length);
            }
        etInputSinyal.setEnabled(false);
        bInputSinyal.setEnabled(false);
    }
    
    public void inverse_dft(){
        DefaultTableModel model = (DefaultTableModel) tabel2.getModel();
        for(int i=0;i<f.length;i++){
                double fr=0;
                double fi=0;
                double fa=0;
                    for(int j=0;j<f.length;j++){
                        fr=fr+Fur[j]*Math.cos(2*Math.PI*i*x[j]/f.length)+Fui[j]*Math.sin(2*Math.PI*i*x[j]/f.length);
                        fi=fi+Fui[j]*Math.cos(2*Math.PI*i*x[j]/f.length)+Fur[j]*Math.sin(2*Math.PI*i*x[j]/f.length);
                        fa=Math.pow(Math.pow(fr, 2)+Math.pow(fi, 2), 0.5);
                    }
                model.addRow(new Object[]{i,f[i],fa/f.length });
                System.out.println("fa["+i+"] = "+fa/f.length);
            }
        etInputSinyal.setEnabled(false);
        bInputSinyal.setEnabled(false);
    }
    
    private void bInputSinyalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInputSinyalActionPerformed
         
        if(pos<=jmlsinyal){
            
            f=Arrays.copyOf(f, pos);
            f[pos-1] = Integer.parseInt(etInputSinyal.getText());
            
            pos++;
            tfSinyal.setText(String.valueOf(pos));
            
        }else{
            tfSinyal.setText(String.valueOf(pos-1));
            etInputSinyal.setEnabled(false);
            
//            for (int i = 0; i < f.length; i++) {
//                System.out.print(f[i]);                
//            }
            trans_fourier();
            inverse_dft();
            //Trans fourier
            
        
        }
        
        
        
    }//GEN-LAST:event_bInputSinyalActionPerformed

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
            java.util.logging.Logger.getLogger(fouriergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fouriergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fouriergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fouriergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fouriergui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInputSinyal;
    private javax.swing.JButton bJmlSinyal;
    private javax.swing.JTextField etInputSinyal;
    private javax.swing.JTextField etJmlSinyal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel1;
    private javax.swing.JTable tabel2;
    private javax.swing.JLabel tfSinyal;
    // End of variables declaration//GEN-END:variables
}
