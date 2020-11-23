/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc_system.gestao_igreja.utilitarios;

import java.util.regex.Pattern;

/**
 *
 * @author marcos.junior
 */
public class FormataData {
    public static String FormataDataBanco(String text) {
        String retorno ;
        int tamanho = text.length();
        String dia,mes,ano;
        
        dia = text.substring(0, 2);
        mes = text.substring(3, 5);
        ano = text.substring(6, 10);
        
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
        
        retorno = ano+"-"+mes+"-"+dia;
        return retorno;
        
    }
    
    public static String FormataDataExibir(String text) {
        String retorno ;
        int tamanho = text.length();
        String dia,mes,ano;
       
        String[] partes = text.split(Pattern.quote("-"));
        
        dia =partes[2]; 
        mes = partes[1];
        ano = partes[0];
        
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
        
        retorno = dia+"/"+mes+"/"+ano;
        return retorno;
        
    }

    public static String FormataDataExibirMascara(String text){
         String retorno ;
        int tamanho = text.length();
        String dia,mes,ano;
       
        String[] partes = text.split(Pattern.quote("-"));
        
        dia =partes[2]; 
        mes = partes[1];
        ano = partes[0];
        
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
        
        retorno = dia+mes+ano;
        return retorno;
    }
    
    public static String MostraMesExtenso(String data){
        String retorno = new String();
        String[] partes = data.split(Pattern.quote("/"));
        
        switch(partes[1]){ 

            case "01":
                retorno = "JANEIRO";
                break;
            case "02":
                retorno = "FEVEREIRO";
                break;
            case "03":
                retorno = "MARCO";
                break;
            case "04":
                retorno = "ABRIL";
                break;
            case "05":
                retorno = "MAIO";
                break;
            case "06":
                retorno = "JUNHO";
                break;
            case "07":
                retorno = "JULHO";
                break;
            case "08":
                retorno = "AGOSTO";
                break;
            case "09":
                retorno = "SETEMBRO";
                break;
            case "10":
                retorno = "OUTUBRO";
                break;
            case "11":
                retorno = "NOVEMBRO";
                break;
            case "12":
                retorno = "DEZEMBRO";
                break;
   
        }
        
        return retorno;
    }
    
    public static String RetornaDia(String data){
        String retorno ;
        String[] partes = data.split(Pattern.quote("/"));
        
        retorno=partes[0];
        
        return retorno;
    }
    
    public static String RetornaMes(String data){
        String retorno;
        String[] partes = data.split(Pattern.quote("/"));        
        
        retorno=partes[1];
        
        return retorno;
    }
    
    public static String RetornaAno(String data){
        String retorno ;
        String[] partes = data.split(Pattern.quote("/"));        
        
        retorno=partes[2];
        
        return retorno;
    }
}

