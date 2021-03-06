/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 05/08/2012, 14:32:53
 */
package com.mc_system.gestao_igreja.criaConexao;

import com.mc_system.gestao_igreja.utilitarios.ConectaBanco;
import com.mc_system.gestao_igreja.utilitarios.InOut;
import com.mc_system.gestao_igreja.utilitarios.Parametros;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MC System
 */
public class CriaUsuario extends javax.swing.JFrame {
public String usuario = Parametros.getsNmUsuas();
ConectaBanco con;
ResultSet lRes;
/** Creates new form TelaPrincipal */

    public CriaUsuario() {
        super(" Criar Usuário");
        JOptionPane.showMessageDialog(rootPane,"Bem Vindo  "+ usuario, "Seja Bem Vindo", JOptionPane.PLAIN_MESSAGE);
        initComponents();
       
        Secretaria.setEnabled(false);
        Tesouraria.setEnabled(false);
        Ebd.setEnabled(false);
        Pastor.setEnabled(false);
        Usu.setEnabled(false);
        Senha1.setEnabled(false);
        Senha2.setEditable(false);
        jButton2.setEnabled(false);
        jPanel3.setEnabled(false);
        
        jPanel1.setEnabled(false);
        UsuarioDeletar.setEnabled(false);
        Id_Usu.setEnabled(false);
        Tab.setEnabled(false);
        jButton5.setEnabled(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Secretaria = new javax.swing.JRadioButton();
        Tesouraria = new javax.swing.JRadioButton();
        Ebd = new javax.swing.JRadioButton();
        Pastor = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Usu = new javax.swing.JTextField();
        Senha1 = new javax.swing.JPasswordField();
        Senha2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UsuarioDeletar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Id_Usu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tab = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criação e Exclusão de Usuários");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criação de usuário", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Função do Usuário"));

        Grupo.add(Secretaria);
        Secretaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Secretaria.setText("Secretaria");
        Secretaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Grupo.add(Tesouraria);
        Tesouraria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tesouraria.setText("Tesouraria");
        Tesouraria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Grupo.add(Ebd);
        Ebd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ebd.setText("Escola Dominical");
        Ebd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Grupo.add(Pastor);
        Pastor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Pastor.setText("Pastor");
        Pastor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Secretaria)
                .addGap(18, 18, 18)
                .addComponent(Tesouraria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Ebd)
                .addGap(18, 18, 18)
                .addComponent(Pastor)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ebd)
                    .addComponent(Tesouraria)
                    .addComponent(Secretaria)
                    .addComponent(Pastor))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("Usuário                 :");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Senha                     :");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Repita a Senha :");

        Usu.setBackground(new java.awt.Color(240, 240, 240));
        Usu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Senha1.setBackground(new java.awt.Color(240, 240, 240));
        Senha1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Senha2.setBackground(new java.awt.Color(240, 240, 240));
        Senha2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton2.setText("Salvar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Usu))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Senha1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Senha2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Sair");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exclusão de Usuário", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Usuário     :");

        UsuarioDeletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UsuarioDeletar.setForeground(new java.awt.Color(204, 0, 0));
        UsuarioDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Id :");

        Id_Usu.setEditable(false);
        Id_Usu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Id_Usu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Usuário", "Função"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tab);
        Tab.getColumnModel().getColumn(0).setResizable(false);
        Tab.getColumnModel().getColumn(0).setPreferredWidth(15);
        Tab.getColumnModel().getColumn(1).setResizable(false);
        Tab.getColumnModel().getColumn(1).setPreferredWidth(300);
        Tab.getColumnModel().getColumn(2).setResizable(false);
        Tab.getColumnModel().getColumn(2).setPreferredWidth(50);

        jButton5.setText("Deletar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsuarioDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Id_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UsuarioDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Id_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        Grupo2.add(jRadioButton1);
        jRadioButton1.setText("Criar Usuário");
        jRadioButton1.setBorderPainted(true);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        Grupo2.add(jRadioButton2);
        jRadioButton2.setText("Deletar Usuário");
        jRadioButton2.setBorderPainted(true);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        Grupo2.add(jToggleButton1);
        jToggleButton1.setText("Limpar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jToggleButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
       
// TODO add your handling code here:
  int confirma = 0;  
  confirma = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE SAIR ?", null, confirma);
    System.out.println(confirma);
    if (confirma == 0){
        System.exit(0);
    }
}//GEN-LAST:event_jButton3MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // ****** Salva os Usuários ********
    int confirma = 0;  
if  (Ebd.isSelected()||Secretaria.isSelected()||Tesouraria.isSelected()||Pastor.isSelected()){  
    confirma = JOptionPane.showConfirmDialog(rootPane, "OS DADOS ESTÃO CORRETOS ? \n Memorize o Usuário e Senha.", null, confirma);
    System.out.println(confirma);
    if (confirma == 0){
       if(!"".equals(Usu.getText())||!"".equals(Senha1.getText())||!"".equals(Senha2.getText())||Senha1.getText()==Senha2.getText())
       {
          CriarUsuario(); 
       } 
       else
       {
           Toolkit.getDefaultToolkit().beep();
           InOut.MsgDeErro(null, "Dados não conferem!!!\n Confira os dados digitados.");
       }
    }           
}else{
    Toolkit.getDefaultToolkit().beep();
    InOut.MsgDeErro(null, "Selecione uma das opções de usuário!!!");
}
        
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        // TODO add your handling code here:
        DeletaUsuario();
    }//GEN-LAST:event_jButton5MousePressed

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        // TODO add your handling code here:
        LimpaCampos();
        Secretaria.setEnabled(false);
        Tesouraria.setEnabled(false);
        Ebd.setEnabled(false);
        Pastor.setEnabled(false);
        Usu.setEnabled(false);
        Senha1.setEnabled(false);
        Senha2.setEditable(false);
        jButton2.setEnabled(false);
        jPanel3.setEnabled(false);
        
        jPanel1.setEnabled(false);
        UsuarioDeletar.setEnabled(false);
        Id_Usu.setEnabled(false);
        Tab.setEnabled(false);
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jToggleButton1MousePressed

    private void TabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMouseClicked
        // TODO add your handling code here:
        CarregaDados();
    }//GEN-LAST:event_TabMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Secretaria.setEnabled(true);
        Tesouraria.setEnabled(true);
        Ebd.setEnabled(true);
        Pastor.setEnabled(true);
        Usu.setEnabled(true);
        Senha1.setEnabled(true);
        Senha2.setEditable(true);
        jButton2.setEnabled(true);
        jPanel3.setEnabled(true);
        
        jPanel1.setEnabled(false);
        UsuarioDeletar.setEnabled(false);
        Id_Usu.setEnabled(false);
        Tab.setEnabled(false);
        jButton5.setEnabled(false);
       
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jPanel1.setEnabled(true);
        UsuarioDeletar.setEnabled(true);
        Id_Usu.setEnabled(true);
        Tab.setEnabled(true);
        jButton5.setEnabled(true);
        
        Secretaria.setEnabled(false);
        Tesouraria.setEnabled(false);
        Ebd.setEnabled(false);
        Pastor.setEnabled(false);
        Usu.setEnabled(false);
        Senha1.setEnabled(false);
        Senha2.setEditable(false);
        jButton2.setEnabled(false);
        jPanel3.setEnabled(false);
        
        PopulaTabela();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CriaUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ebd;
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.JTextField Id_Usu;
    private javax.swing.JRadioButton Pastor;
    private javax.swing.JRadioButton Secretaria;
    private javax.swing.JPasswordField Senha1;
    private javax.swing.JPasswordField Senha2;
    private javax.swing.JTable Tab;
    private javax.swing.JRadioButton Tesouraria;
    private javax.swing.JTextField Usu;
    private javax.swing.JTextField UsuarioDeletar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void LimpaCampos() {
     Usu.setText("");   
     Senha1.setText("");   
     Senha2.setText("");
     UsuarioDeletar.setText("");
     Id_Usu.setText("");
    }

    private void CriarUsuario() {
        String sSql= new String();
        //GRANT ALL PRIVILEGES ON NOMEBANCO.* TO 'USUARIO'@'localhost' IDENTIFIED BY 'senha';  **** gera usuário e senha ****
    try {    
    con=new ConectaBanco();
    
    if(Pastor.isSelected())
    {
        sSql="INSERT INTO USUARIO(USUARIO,SENHA,FUNCAO) VALUES('"+Usu.getText()+"','"+Senha1.getText()+"','Geral');";  
    }
    else if(Secretaria.isSelected())
    {
        sSql="INSERT INTO USUARIO(USUARIO,SENHA,FUNCAO) VALUES('"+Usu.getText()+"','"+Senha1.getText()+"','Secretaria');";
    }
     else if(Tesouraria.isSelected())
    {
        sSql="INSERT INTO USUARIO(USUARIO,SENHA,FUNCAO) VALUES('"+Usu.getText()+"','"+Senha1.getText()+"','Tesouraria');";
    }
    else if(Ebd.isSelected())
    {
        sSql="INSERT INTO USUARIO(USUARIO,SENHA,FUNCAO) VALUES('"+Usu.getText()+"','"+Senha1.getText()+"','Secretaria_EBD');";
    }
    System.out.println(sSql);
        
            con.conecta();
            con.executa(sSql);
            
            InOut.MsgDeInformacao(null, "Usuário criado com Sucesso");
        } catch (SQLException ex) {
            InOut.MsgDeErro(null, "Erro ao criar Usuário");
        }
    con.desconecta();
    }

    private void DeletaUsuario() {
        String sSql=new String();
        con = new ConectaBanco();
        
        sSql="DELETE FROM USUARIO WHERE idusuario="+Id_Usu.getText()+";";
        con.conecta();
        try {
            con.executa(sSql);
        } catch (SQLException ex) {
            InOut.MsgDeErro(null, "Erro ao excluir usuário!");
        }
        con.desconecta();
        PopulaTabela();
    }

    private void CarregaDados()
    {
        int linha=0;
        String sSql=new String();
        String sMembro = new String();       
        linha=Tab.getSelectedRow();
        sMembro = Tab.getValueAt(linha, 0).toString();
        con=new ConectaBanco();

        sSql="SELECT * FROM usuario WHERE idusuario='"+sMembro+"'ORDER BY usuario;";
        con.conecta();
        try {
            con.executaSelect(sSql);
        } catch (SQLException ex) {
            Logger.getLogger(CriaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(sSql);
        lRes=con.resultset;        
        try 
        {           
            while (lRes.next())
            {
                 Id_Usu.setText(lRes.getString("idusuario")); 
                 UsuarioDeletar.setText(lRes.getString("Usuario")); 
            }            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(CriaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }        
        con.desconecta();
   
   
    }

    private void PopulaTabela()
    {
        DefaultTableModel modelo1 = (DefaultTableModel) Tab.getModel();
        int i=0,recebeProgresso;
        recebeProgresso = 0;
        con=new ConectaBanco();
        String sSql,contador=new String();
        
       try {
         sSql="SELECT idusuario,usuario,funcao from usuario order by usuario;";
        con.conecta();
        con.executaSelect(sSql); 
        System.out.println(contador);
        lRes = con.resultset;      
        System.out.println(lRes);
            modelo1.setRowCount(0);
            while (lRes.next()) {
                modelo1.addRow(new Object[]{
                            lRes.getString("idusuario"),
                            lRes.getString("usuario"),
                            lRes.getString("funcao") 
                           });
            }
          Tab.setModel(modelo1);
        } catch (SQLException ex) {

            InOut.MsgDeErro(null, "ERRO AO PESQUISAR");
        }
        con.desconecta();
        
        
    }
    
    
}
