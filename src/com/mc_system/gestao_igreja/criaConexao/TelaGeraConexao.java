/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc_system.gestao_igreja.criaConexao;


import com.mc_system.gestao_igreja.utilitarios.InOut;
import com.mc_system.gestao_igreja_principal.ConectaSystem;
import com.mc_system.gestao_igreja_principal.TelaPrincipal;

import java.awt.FileDialog;
import java.io.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author marcos.junior
 */
public class TelaGeraConexao extends javax.swing.JFrame {
FileDialog salvar ;
String diretorio = new String();
CriaTabela criar;
Cria_Banco criaBanco;
    /**
     * Creates new form TelaGeraConexao
     */
    public TelaGeraConexao() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtDriver.setText("");
        LimpaCampos();
        
        btSalvar.setEnabled(false);
        txtURL.setEditable(false);
        
       salvar = new FileDialog(this, "Salvar", FileDialog.SAVE);
       salvar.setFile("System.ini"); 
        try {
            MaskFormatter formato = new MaskFormatter("###.###.###.###");
            MaskFormatter formato2 = new MaskFormatter("####");
            formato.install(txtIpServidor);
           // formato2.install(txtPorta);
        } catch (ParseException ex) {
           
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbODBC = new javax.swing.JRadioButton();
        rbMySQL = new javax.swing.JRadioButton();
        rbSQLServer = new javax.swing.JRadioButton();
        rbPostgre = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        txtIpServidor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDriver = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar conexão");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Banco"));

        buttonGroup1.add(rbODBC);
        rbODBC.setText("ODBC");
        rbODBC.setEnabled(false);
        rbODBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbODBCActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMySQL);
        rbMySQL.setText("MySQL");
        rbMySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMySQLActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSQLServer);
        rbSQLServer.setText("SQL Server");
        rbSQLServer.setEnabled(false);
        rbSQLServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSQLServerActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPostgre);
        rbPostgre.setText("Postgre");
        rbPostgre.setEnabled(false);
        rbPostgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPostgreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbODBC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMySQL)
                .addGap(57, 57, 57)
                .addComponent(rbSQLServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPostgre)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbODBC)
                .addComponent(rbMySQL)
                .addComponent(rbSQLServer)
                .addComponent(rbPostgre))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do banco"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome do Banco:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Usuário:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Senha :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("IP Servidor:");

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 204));
        txtSenha.setText("jTextField2");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 204));
        txtUsuario.setText("jTextField3");

        txtBanco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtBanco.setForeground(new java.awt.Color(0, 0, 204));
        txtBanco.setText("jTextField4");

        txtIpServidor.setForeground(new java.awt.Color(0, 0, 204));
        txtIpServidor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Driver :");

        txtDriver.setEditable(false);
        txtDriver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDriver.setForeground(new java.awt.Color(0, 0, 204));
        txtDriver.setText("jTextField1");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Porta :");

        txtPorta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPorta.setForeground(new java.awt.Color(0, 0, 204));

        jButton1.setText("Gerar URL");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha)
                    .addComponent(txtUsuario)
                    .addComponent(txtBanco)
                    .addComponent(txtDriver)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIpServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("URL de Conexão"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("URL:");

        txtURL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtURL.setForeground(new java.awt.Color(0, 0, 204));
        txtURL.setText("jTextField2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton2.setText("Fechar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSalvarMousePressed(evt);
            }
        });

        jButton4.setText("Limpar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btSalvar)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbODBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbODBCActionPerformed
       txtDriver.setText("sun.jdbc.odbc.JdbcOdbcDriver");
       txtURL.setEditable(true);
       txtPorta.setText("");
       LimpaCampos();
    }//GEN-LAST:event_rbODBCActionPerformed

    private void rbMySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMySQLActionPerformed
       txtDriver.setText("com.mysql.jdbc.Driver");
       txtURL.setEditable(false);
       txtPorta.setText("3306");
       LimpaCampos();
    }//GEN-LAST:event_rbMySQLActionPerformed

    private void rbSQLServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSQLServerActionPerformed
        txtDriver.setText("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        txtURL.setEditable(false);
        txtPorta.setText("");
        LimpaCampos();
    }//GEN-LAST:event_rbSQLServerActionPerformed

    private void rbPostgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPostgreActionPerformed
        txtDriver.setText("org.postgresql.Driver");
        txtURL.setEditable(false);
        txtPorta.setText("");
        LimpaCampos();
    }//GEN-LAST:event_rbPostgreActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if(rbODBC.isSelected()){
            txtURL.setText("jdbc:odbc:"+txtBanco.getText());
            btSalvar.setEnabled(true);
        }
        else if(rbMySQL.isSelected()){
            txtURL.setText("jdbc:mysql://"+txtIpServidor.getText()+":"+txtPorta.getText()+"/"+txtBanco.getText());
            btSalvar.setEnabled(true);
        }
        
        else if(rbSQLServer.isSelected()){
            txtURL.setText("jdbc:sqlserver://"+txtIpServidor.getText()+":"+txtPorta.getText()+";databaseName="+txtBanco.getText());
            btSalvar.setEnabled(true);
        }
        else if(rbPostgre.isSelected()){
            txtURL.setText("jdbc:postgre://"+txtIpServidor.getText()+":"+txtPorta.getText()+"/"+txtBanco.getText());
            btSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1MousePressed

    private void btSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMousePressed
        try {
            // TODO add your handling code here:
          // salvar.setVisible(true);
           //  diretorio = salvar.getDirectory();
           // System.out.println(diretorio);
          //  if(diretorio!=null){
        ConfiguraConexao();
        } catch (SQLException ex) {
            InOut.MsgDeErro(null, ex.getMessage());
            return;
        }
        CriaUsuMaster();    
        GerarArquivoINI();
      //  }
        
    }//GEN-LAST:event_btSalvarMousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
//        ConectaSystem abrir = new ConectaSystem();
//        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO add your handling code here:
        LimpaCampos();
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton4MousePressed

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
            java.util.logging.Logger.getLogger(TelaGeraConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGeraConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGeraConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGeraConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeraConexao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbMySQL;
    private javax.swing.JRadioButton rbODBC;
    private javax.swing.JRadioButton rbPostgre;
    private javax.swing.JRadioButton rbSQLServer;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtDriver;
    private javax.swing.JFormattedTextField txtIpServidor;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void LimpaCampos() {
        txtBanco.setText("");
        txtIpServidor.setText("");
        txtSenha.setText("");
        txtUsuario.setText("");
        txtURL.setText("");
        //txtDriver.setText("");
        //txtPorta.setText("");
    }

    private void GerarArquivoINI() {
        try {
            PrintWriter out = new PrintWriter("System.ini");
            out.println("[Dados Servidor]");
            out.println("Banco&"+txtBanco.getText());
            out.println("IP Servidor&"+txtIpServidor.getText());
            out.println("Driver&"+txtDriver.getText());
            out.println("URL&"+txtURL.getText());
            out.println("Usuario&"+txtUsuario.getText());
            out.println("Senha&"+txtSenha.getText());
          
            out.close();
            JOptionPane.showMessageDialog(null, "Conexão configurada com Sucesso!");
        } catch (FileNotFoundException ex) {
            InOut.MsgDeErro(null, ex.getMessage());
        }
       
    }

    private void ConfiguraConexao() throws SQLException {
        ParametrosBanco.setDriver(txtDriver.getText().trim());
        ParametrosBanco.setSenhaBanco(txtSenha.getText().trim());
        ParametrosBanco.setURL(txtURL.getText().trim());
        ParametrosBanco.setServidor(txtIpServidor.getText().trim());
        criar = new CriaTabela();
        criaBanco = new Cria_Banco();
        String[] tab = new String[9];
        String banco;
        int i;
        
        banco="CREATE  DATABASE "+txtBanco.getText()+";";
        
        tab[0]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`agenda_extra` (`idagenda` INT(11) NOT NULL AUTO_INCREMENT ,`nome` VARCHAR(255) NOT NULL ,`telefone` VARCHAR(45) NULL DEFAULT NULL ,`tel_celular` VARCHAR(45) NULL DEFAULT NULL ,PRIMARY KEY (`idagenda`) );";
        tab[1]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`diretoria` (`iddiretoria` INT(11) NOT NULL AUTO_INCREMENT ,`presidente` VARCHAR(255) NOT NULL ,  `vice_presidente` VARCHAR(255) NOT NULL ,  `tesoureiro01` VARCHAR(255) NOT NULL ,  `tesoureiro02` VARCHAR(255) NOT NULL ,  `secretario01` VARCHAR(255) NOT NULL ,  `secretario02` VARCHAR(255) NOT NULL ,  `contas01` VARCHAR(255) NOT NULL ,  `contas02` VARCHAR(255) NOT NULL ,  `contas03` VARCHAR(255) NOT NULL ,  `ano_posse` VARCHAR(45) NOT NULL ,  `ano_entrega` VARCHAR(45) NOT NULL ,  PRIMARY KEY (`iddiretoria`) );";     
        tab[2]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`dizimo` (`idDizimo` INT(11) NOT NULL AUTO_INCREMENT ,  `Nome` VARCHAR(45) NULL DEFAULT NULL ,  `JANEIRO` VARCHAR(45) NULL DEFAULT NULL ,  `FEVEREIRO` VARCHAR(45) NULL DEFAULT NULL ,  `MARCO` VARCHAR(45) NULL DEFAULT NULL ,  `ABRIL` VARCHAR(45) NULL DEFAULT NULL ,  `MAIO` VARCHAR(45) NULL DEFAULT NULL ,  `JUNHO` VARCHAR(45) NULL DEFAULT NULL ,  `JULHO` VARCHAR(45) NULL DEFAULT NULL ,  `AGOSTO` VARCHAR(45) NULL DEFAULT NULL ,  `SETEMBRO` VARCHAR(45) NULL DEFAULT NULL ,  `OUTUBRO` VARCHAR(45) NULL DEFAULT NULL ,  `NOVEMBRO` VARCHAR(45) NULL DEFAULT NULL ,  `DEZEMBRO` VARCHAR(45) NULL DEFAULT NULL ,  `ANO` VARCHAR(45) NULL DEFAULT NULL ,  PRIMARY KEY (`idDizimo`) );";
        tab[3]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`ebd` (  `idebd` INT(11) NOT NULL AUTO_INCREMENT ,  `NOME_ALUNO` VARCHAR(255) NULL DEFAULT NULL ,  `CLASSE_ALUNO` VARCHAR(45) NULL DEFAULT NULL ,  `USUARIO` VARCHAR(45) NULL DEFAULT NULL ,  PRIMARY KEY (`idebd`) );";
        tab[4]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`ebd_oferta` (  `idEBD_Oferta` INT(11) NOT NULL AUTO_INCREMENT ,  `domingo` VARCHAR(45) NULL DEFAULT NULL ,  `trimestre` VARCHAR(45) NULL DEFAULT NULL ,  `ano` VARCHAR(45) NULL DEFAULT NULL ,  `valor` VARCHAR(45) NULL DEFAULT NULL ,  PRIMARY KEY (`idEBD_Oferta`) )";
        tab[5]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`ebd_presenca` (  `idEBD_Presenca` INT(11) NOT NULL AUTO_INCREMENT ,  `Domingo` VARCHAR(45) NULL DEFAULT NULL ,  `Trimestre` VARCHAR(45) NULL DEFAULT NULL ,  `Ano` VARCHAR(45) NULL DEFAULT NULL ,  `Aluno_classe` VARCHAR(45) NULL DEFAULT NULL ,  `Classe_aluno` VARCHAR(45) NULL DEFAULT NULL ,  `Presenca` VARCHAR(45) NULL DEFAULT NULL ,  PRIMARY KEY (`idEBD_Presenca`) );";
        tab[6]="CREATE TABLE IF NOT EXISTS`"+txtBanco.getText()+"`.`lancamento` (  `idlancamento` int(11) NOT NULL AUTO_INCREMENT,`data_lancamento` date NOT NULL,`tipo_lancamento` varchar(45) NOT NULL,  `descricao` varchar(45) NOT NULL,  `valor` varchar(45) NOT NULL,  `membro` varchar(45) DEFAULT NULL,  `usuario_sistema` varchar(45) NOT NULL,  `data_log` date NOT NULL,  PRIMARY KEY (`idlancamento`))"; 
        tab[7]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`membros` (  `idmembros` INT(11) NOT NULL AUTO_INCREMENT ,  `NOME` VARCHAR(45) NOT NULL ,  `NATURALIDADE` VARCHAR(45) NULL DEFAULT NULL ,  `DIANASCIMENTO` VARCHAR(45) NOT NULL ,  `MESNASCIMENTO` VARCHAR(45) NOT NULL ,  `ANONASCIMENTO` VARCHAR(45) NOT NULL ,  `BATIZADO` VARCHAR(45) NULL DEFAULT NULL ,  `RG` VARCHAR(45) NULL DEFAULT NULL ,  `ORGAO_EXPEDITOR` VARCHAR(45) NULL DEFAULT NULL ,  `CPF` VARCHAR(45) NULL DEFAULT NULL ,  `FAIXA_IDADE` VARCHAR(45) NOT NULL ,  `ENDERECO` VARCHAR(255) NULL DEFAULT NULL ,  `NUMERO` VARCHAR(45) NULL DEFAULT NULL ,  `COMPLEMENTO` VARCHAR(45) NULL DEFAULT NULL ,  `CIDADE` VARCHAR(45) NULL DEFAULT NULL ,  `ESTADO` VARCHAR(45) NULL DEFAULT NULL ,  `ATIVO` VARCHAR(45) NULL DEFAULT NULL ,  `ESTADO_CIVIL` VARCHAR(45) NULL DEFAULT NULL ,  `SEXO` VARCHAR(45) NOT NULL ,  `TELEFONE` VARCHAR(45) NULL DEFAULT NULL ,  `TEL_CELULAR` VARCHAR(45) NULL DEFAULT NULL ,  PRIMARY KEY (`idmembros`) );";
        tab[8]="CREATE  TABLE IF NOT EXISTS `"+txtBanco.getText()+"`.`usuario` (  `idUsuario` INT(11) NOT NULL AUTO_INCREMENT ,  `Usuario` VARCHAR(45) NULL DEFAULT NULL ,  `Senha` VARCHAR(45) NULL DEFAULT NULL ,  `Funcao` VARCHAR(45) NULL DEFAULT NULL ,  PRIMARY KEY (`idUsuario`) );";
        
        
        
        
        
        
      criaBanco.conecta();
      criaBanco.executa(banco);
      System.out.println(banco);
      criaBanco.desconecta();
        
        criar.conecta();

       for(i=8;i>=0;i--){
            
           criar.executa(tab[i]);
    
       }
       criar.desconecta();
       
}

    private void CriaUsuMaster() {
        criar = new CriaTabela();
        criar.conecta();
        try {
            criar.executa("insert into usuario(idusuario,usuario,senha,funcao) values(1,'Master','master','Geral');");
        } catch (SQLException ex) {
            Logger.getLogger(TelaGeraConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        criar.desconecta();
    }
}