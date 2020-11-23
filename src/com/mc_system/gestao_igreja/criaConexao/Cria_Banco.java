/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc_system.gestao_igreja.criaConexao;


import com.mc_system.gestao_igreja.utilitarios.InOut;
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
public class Cria_Banco {
    public String Url = ParametrosBanco.getURL();
    public String senhaBanco = ParametrosBanco.getSenhaBanco();
    public String Driver = ParametrosBanco.getDriver();
    public String servidor = ParametrosBanco.getServidor();
    
            
    Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        try
        {                      
            String url = "jdbc:mysql://"+servidor+":3306/";
            System.out.println(url);
            System.out.println(Driver);
            
            Class.forName(Driver);
            
            conexao = DriverManager.getConnection(url, "root", senhaBanco);
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
   
    

}