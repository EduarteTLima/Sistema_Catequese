/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Telas.Catequese;

import com.mycompany.Arquivos_Sistemas_Brutos.Constantes;
import com.mycompany.Dao.DaoCatequese;
import com.mycompany.Dao.DaoCatequista;
import com.mycompany.Dao.DaoTurma;
import com.mycompany.Dao.DaoVolume;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo.3946
 */
public class CadCatequese extends javax.swing.JFrame {

    /**
     * Creates new form CadCatequese
     */
    public CadCatequese() {
        initComponents();
        
        DaoCatequese daoCatequese = new DaoCatequese();

        int id = daoCatequese.buscarProximoId(); 
        if (id >= 0)
            tfId.setText(String.valueOf(id));

//        btnAcao.setText(Constantes.BTN_SALVAR_TEXT);
//        btnExcluir.setVisible(false);
        
        carregarCatequistas();
        recuperaIdCatequista();
        
        carregarVolume();
        recuperaIdVolume();
        
        setLocationRelativeTo(null);
        
        tfId.setEnabled(false);
        
        tfIdTurma.setText(String.valueOf(new DaoTurma().buscarProximoId()));
    }
    
    private void inserir(){
        DaoCatequese daoCatequese = new DaoCatequese();
        DaoTurma daoTurma = new DaoTurma();
        
        if (    daoCatequese.inserir(Integer.parseInt(tfId.getText()), Integer.parseInt(tfIdVolume.getText()), tfInicio.getText(), tfFim.getText(), Integer.parseInt(tfIdCatequista.getText())) && 
                daoTurma.inserir(Integer.parseInt(tfIdTurma.getText()), Integer.parseInt(tfId.getText()))){
            
            JOptionPane.showMessageDialog(null, "Catequese salva com sucesso!");
            
            tfId.setText(String.valueOf(daoCatequese.buscarProximoId()));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível salvar a catequese!");
        }
    }
    
//    private void alterar(){
//        DaoCategoria daoCategoria = new DaoCategoria();
//        
//        if (daoCategoria.alterar(Integer.parseInt(tfId.getText()), tfNome.getText(), taDescricao.getText())){
//            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!");
//            
//            tfId.setText("");
//            tfNome.setText("");
//            taDescricao.setText("");
//        }else{
//            JOptionPane.showMessageDialog(null, "Não foi possível alterar a categoria!");
//        }
//        
//        ((ListCategoria) Formularios.listCategoria).listarTodos();
//        
//        dispose();
//    }
//    
//    private void excluir(){
//        DaoCategoria daoCategoria = new DaoCategoria();
//        
//        if (daoCategoria.excluir(Integer.parseInt(tfId.getText()))){
//            JOptionPane.showMessageDialog(null, "Categoria " + tfNome.getText() + " excluída com sucesso!");
//            
//            tfId.setText("");
//            tfNome.setText("");
//            taDescricao.setText("");
//        }else{
//            JOptionPane.showMessageDialog(null, "Não foi possível excluir a categoria!");
//        }
//        
//        ((ListCategoria) Formularios.listCategoria).listarTodos();
//        
//        dispose();
//    }
    
    public void carregarCatequistas(){
        try{
            DaoCatequista daoCatequista = new DaoCatequista();

            ResultSet resultSet = daoCatequista.listarTodos();

            while(resultSet.next())
                jcbCatequista.addItem(resultSet.getString("NOME"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void recuperaIdCatequista(){
        try{
            DaoCatequista daoCatequista = new DaoCatequista();
            ResultSet resultSet = daoCatequista.listarPorNome(jcbCatequista.getSelectedItem().toString());
            
            resultSet.next();
            tfIdCatequista.setText(resultSet.getString("ID"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void carregarVolume(){
        try{
            DaoVolume daoVolume = new DaoVolume();

            ResultSet resultSet = daoVolume.listarTodos();

            while(resultSet.next())
                jcbVolume.addItem(resultSet.getString("NOME"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void recuperaIdVolume(){
        try{
            DaoVolume daoVolume = new DaoVolume();
            ResultSet resultSet = daoVolume.listarPorVolume(jcbVolume.getSelectedItem().toString());
            
            resultSet.next();
            tfIdVolume.setText(resultSet.getString("ID"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbVolume = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfFim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbCatequista = new javax.swing.JComboBox<>();
        btnAcao = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfIdVolume = new javax.swing.JTextField();
        tfIdCatequista = new javax.swing.JTextField();
        tfIdTurma = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catequese");

        jLabel1.setText("ID");

        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Volume");

        jcbVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVolumeActionPerformed(evt);
            }
        });

        jLabel4.setText("Data início");

        tfInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInicioActionPerformed(evt);
            }
        });

        jLabel5.setText("Data fim");

        jLabel6.setText("Catequista");

        jcbCatequista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCatequistaItemStateChanged(evt);
            }
        });

        btnAcao.setText("Salvar");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfIdVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdVolumeActionPerformed(evt);
            }
        });

        tfIdTurma.setText("idTurma");
        tfIdTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAcao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbCatequista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfIdTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbVolume, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfInicio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfIdVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfIdCatequista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCatequista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdCatequista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcao)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCatequistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCatequistaItemStateChanged
        recuperaIdCatequista();
    }//GEN-LAST:event_jcbCatequistaItemStateChanged

    private void jcbVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVolumeActionPerformed
        recuperaIdVolume();
    }//GEN-LAST:event_jcbVolumeActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void tfInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInicioActionPerformed

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
        DaoCatequese daoCatequese = new DaoCatequese();
        
        if (btnAcao.getText() == Constantes.BTN_SALVAR_TEXT){
            inserir();
            
//            tfId.setText(String.valueOf(daoCatequese.buscarProximoId()));
//            tfNome.setText("");
//            taDescricao.setText("");;
        }
//        else if (btnAcao.getText() == Constantes.BTN_ALTERAR_TEXT){
//            alterar();
//            ((ListCategoria) Formularios.listCategoria).listarTodos();
//            dispose();
//        }
    }//GEN-LAST:event_btnAcaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfIdVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdVolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdVolumeActionPerformed

    private void tfIdTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(CadCatequese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCatequese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCatequese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCatequese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCatequese().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jcbCatequista;
    private javax.swing.JComboBox<String> jcbVolume;
    private javax.swing.JTextField tfFim;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIdCatequista;
    private javax.swing.JTextField tfIdTurma;
    private javax.swing.JTextField tfIdVolume;
    private javax.swing.JTextField tfInicio;
    // End of variables declaration//GEN-END:variables
}
