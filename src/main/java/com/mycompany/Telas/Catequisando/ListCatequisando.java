/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Telas.Catequisando;

import com.mycompany.Arquivos_Sistemas_Brutos.Dados_Temporarios;
import com.mycompany.Dao.DaoCatequisando;
import com.mycompany.Dao.DaoMatricula;
import com.mycompany.Mod.ModCatequisando;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo.3946
 */
public class ListCatequisando extends javax.swing.JFrame {

    /**
     * Creates new form Listcatequisando
     */
    public ListCatequisando() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCatequese.getModel();
            
            tableCatequese.setModel(defaultTableModel);

            DaoCatequisando daoCatequisando = new DaoCatequisando();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCatequisando.listarTodos();
            
            defaultTableModel.setRowCount(0);
             while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_matricula = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String id_endereco = resultSet.getString(4);
                String descricao = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, id_matricula, nome, id_endereco, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCatequese.getModel();

            tableCatequese.setModel(defaultTableModel);

            DaoCatequisando daoCatequisando = new DaoCatequisando();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCatequisando.listarPorIdmatricula(pId);
            
            defaultTableModel.setRowCount(0);
             while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_matricula = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String id_endereco = resultSet.getString(4);
                String descricao = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, id_matricula, nome, id_endereco, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorIdmatricula(int pId_matricula){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCatequese.getModel();

            tableCatequese.setModel(defaultTableModel);

            DaoCatequisando daoCatequisando = new DaoCatequisando();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCatequisando.listarPorIdmatricula(pId_matricula);
            
            defaultTableModel.setRowCount(0);
             while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_matricula = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String id_endereco = resultSet.getString(4);
                String descricao = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, id_matricula, nome, id_endereco, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public void listarPorNome(String pNome){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCatequese.getModel();
            
            tableCatequese.setModel(defaultTableModel);

            DaoCatequisando daoCatequisando = new DaoCatequisando();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCatequisando.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
             while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_matricula = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String id_endereco = resultSet.getString(4);
                String descricao = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, id_matricula, nome, id_endereco, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorIdendereco(int pId_endereco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCatequese.getModel();

            tableCatequese.setModel(defaultTableModel);

            DaoCatequisando daoCatequisando = new DaoCatequisando();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCatequisando.listarPorIdEndereco(pId_endereco);
            
            
            defaultTableModel.setRowCount(0);
             while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_matricula = resultSet.getString(2);
               String id_catequista = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, id_matricula, id_catequista, nome, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorDescricao(String pDescricao){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCatequese.getModel();
            
            tableCatequese.setModel(defaultTableModel);

            DaoCatequisando daoCatequisando = new DaoCatequisando();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCatequisando.listarPorDescricao(pDescricao);
            
            defaultTableModel.setRowCount(0);
             while (resultSet.next()){
                String id = resultSet.getString(1);
                String id_matricula = resultSet.getString(2);
               String id_catequista = resultSet.getString(3);
                String nome = resultSet.getString(4);
                String descricao = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{id, id_matricula, id_catequista, nome, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
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

        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCatequese = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "MATRICULA", "NOME", "ENDERECO", "DESCRIÇÃO" }));
        jcbTipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoFiltroActionPerformed(evt);
            }
        });

        tfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltroActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableCatequese.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ID_ENDERECO", "ID_MATRICULA", "NOME_DA_CRIANC", "DESCRICAO"
            }
        ));
        tableCatequese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCatequeseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCatequese);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoFiltroActionPerformed

    private void tfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFiltroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(tfFiltro.getText()));
                break;
            case 2:
                listarPorIdmatricula(Integer.parseInt(tfFiltro.getText()));
                break;
            case 3:
                listarPorNome(tfFiltro.getText());
                break;
            case 4:
                listarPorIdendereco(Integer.parseInt(tfFiltro.getText()));
                break;
            case 5:
                listarPorDescricao(tfFiltro.getText());
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tableCatequeseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCatequeseMouseClicked
        try{
            if (evt.getClickCount() == 2){
                ModCatequisando modCatequisando = new ModCatequisando();

                modCatequisando.setId(Integer.parseInt(String.valueOf(tableCatequese.getValueAt(tableCatequese.getSelectedRow(), 0))));
                modCatequisando.setNome(String.valueOf(tableCatequese.getValueAt(tableCatequese.getSelectedRow(), 2)));
                modCatequisando.setId_endereco(Integer.parseInt(String.valueOf(tableCatequese.getValueAt(tableCatequese.getSelectedRow(), 3))));
                modCatequisando.setDescricao(String.valueOf(tableCatequese.getValueAt(tableCatequese.getSelectedRow(), 4)));

                DaoMatricula daoMatricula = new DaoMatricula();
                    ResultSet resultSet = daoMatricula.listarPorId(Integer.parseInt(String.valueOf(tableCatequese.getValueAt(tableCatequese.getSelectedRow(), 1))));

                    int idMatricula = -1;

                    while(resultSet.next())
                        idMatricula = resultSet.getInt("ID");
                Dados_Temporarios.tempObject = (ModCatequisando) modCatequisando;

                CadCatequisando cadCatequisando = new CadCatequisando();
                cadCatequisando.setVisible(true);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_tableCatequeseMouseClicked

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
            java.util.logging.Logger.getLogger(ListCatequisando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCatequisando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCatequisando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCatequisando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCatequisando().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableCatequese;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
