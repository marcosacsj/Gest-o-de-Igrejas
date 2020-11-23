package com.mc_system.gestao_igreja.utilitarios;
import javax.swing.JOptionPane;



public class InOut 
{

	public static void MsgDeErro(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
	}
	public static void MsgDeInformacao(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.INFORMATION_MESSAGE);
	}
	public static void MsgSemIcone(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.PLAIN_MESSAGE);
	}
	public static void MsgDeAviso(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.WARNING_MESSAGE);
	}
	public static int MsgDeSimNao (String cabecalho, String frase)
	{
		String str[] = {"Sim","Não"};
		int li_opcao = JOptionPane.showOptionDialog(null, frase, "",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,  null, str, str[0]);
		return li_opcao;
		
	}
	
}
