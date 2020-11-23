/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc_system.gestao_igreja.criaConexao;

/**
 *
 * @author marcos.junior
 */
public class ParametrosBanco {
    private static String Driver;
    private static String SenhaRoot;
    private static String URL;
    private static String Servidor;
    
    public static String getDriver()
    {
        return Driver;
    }
    public static void setDriver(String aDriver)
    {
       ParametrosBanco.Driver=aDriver;
      
    }
    
    public static String getSenhaBanco()
    {
        return SenhaRoot;
    }
    public static void setSenhaBanco(String aSenhaBanco)
    {
       ParametrosBanco.SenhaRoot=aSenhaBanco;  
    }
    
    public static String getURL()
    {
        return URL;
    }
    public static void setURL(String aURL)
    {
       ParametrosBanco.URL=aURL;  
    }
    public static String getServidor()
    {
        return Servidor;
    }
    public static void setServidor(String aServidor)
    {
       ParametrosBanco.Servidor=aServidor;  
    }
}
