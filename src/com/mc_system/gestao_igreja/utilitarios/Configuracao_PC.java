/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc_system.gestao_igreja.utilitarios;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marcos.junior
 */
public class Configuracao_PC {
   
    
    public static String NomePC(){
        InetAddress ip;
        String nome_pc = new String();
        try {
            ip = InetAddress.getLocalHost();
            nome_pc = ip.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
        return nome_pc;   
    }
    
    public static String IPPC(){
        InetAddress ip;
        String ip_pc = new String();
        try {
            ip = InetAddress.getLocalHost();
            ip_pc = ip.getHostAddress();
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
        return ip_pc;
    }
    
    public static String MacPC() {
        InetAddress ip;
        StringBuilder sb = new StringBuilder();
        try{
            ip = InetAddress.getLocalHost();   
            NetworkInterface network;  
            network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();    
            for (int i = 0; i < mac.length; i++) {  
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));       
            } 
            } catch (UnknownHostException | SocketException e) {
                System.out.println(e.getMessage());
            }
        return sb.toString();
  }
    
    public static String NomeOS(){
        String OSName = System.getProperty("os.name");
        return OSName;
    }
    
    public static String VersaoOS(){
        String OSVersao = System.getProperty("os.version");
        return OSVersao;
    }
    
    public static String JavaVersao(){
        String VersionJava = System.getProperty("java.version");
        return VersionJava;
    }
    public static String DataSistema(){
        String datasistema = new String();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        datasistema = dateFormat.format(date);       
        return datasistema;
    }
    public static String MostraDataPC(){
       String datasistema = new String();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        datasistema = dateFormat.format(date);       
        return datasistema; 
    }
}
