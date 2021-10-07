package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		
		String caminho = "c:\\temp\\in.txt";
		
	  try (BufferedReader genArquivo = new BufferedReader(new FileReader(caminho))) {
			String linha = genArquivo.readLine();
			while (linha != null) {
			  System.out.println(linha);
			linha = genArquivo.readLine();
			}
		}catch (IOException execao) {
			System.out.println("Error: " + execao.getLocalizedMessage());
		}
	   //Por inicializar os recursos direto no try with resorces 
	  // Não precisa de outro try/catch para tratar execptions
	  // Porque ele desaloca automaticamente
	}
}
