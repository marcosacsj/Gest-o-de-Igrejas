/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc_system.gestao_igreja.utilitarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



/**
 *
 * @author MC System Work's
 */
public class ConectaBanco {
   
    File arquivo = new File("System.ini");
    
    String Banco = new String();
    String servidor = new String();
    String Driver = new String();
    String Url = new String();
    String Usuario = new String();
    String senhaBanco = new String();
            
    Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        try
        {
            VerificaBanco();
            
            Class.forName(Driver);
            conexao = DriverManager.getConnection(Url, Usuario, senhaBanco);

           // System.out.println("Conexão realizada no Banco: "+Banco);
        } 
        catch (ClassNotFoundException ex) 
        {
            InOut.MsgDeErro(null, "Drive não localizado\n"+ex.getMessage());
            result=false;
        }
        catch (SQLException sqlex)
        {
            JOptionPane.showMessageDialog(null,sqlex.getMessage());
            result=false;
        }
        return result;
    }
   public void executaSelect (String query) throws SQLException{
       
            statement = conexao.createStatement();
            resultset = statement.executeQuery(query);

        
    }
    public void desconecta(){
        try {   
            conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    public void executa(String query) throws SQLException{
        
           statement = conexao.createStatement();
           statement.executeUpdate(query);
        
    }
    public String mostraIP(){
        VerificaBanco();
        return servidor;      
    }

    private void VerificaBanco() {
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(arquivo));
            String str;
              while( (str = in.readLine()) != null ){
                  if(!"[BancoDeDados]".equals(str)){
                      String[] partes = str.split(Pattern.quote("&"));
                      switch(partes[0]){
                          case "Banco":
                              Banco=partes[1];
                             // System.out.println(partes[1]);
                              break;
                          case "IP Servidor":
                              servidor=partes[1];
                            //  System.out.println(partes[1]);
                              break;
                          case "Driver":
                              Driver=partes[1];
                            //  System.out.println(partes[1]);
                              break;
                          case "URL":
                              Url=partes[1];
                           ///   System.out.println(partes[1]);
                              break;
                          case "Usuario":
                              Usuario=partes[1];
                              
                              break;
                          case "Senha":
                              senhaBanco = partes[1];
                             
                              break;  
                      }
                  }                  
            }  
        in.close();
        } catch (IOException e) {
            InOut.MsgDeErro(null, e.getMessage());
        }
   
    }

}