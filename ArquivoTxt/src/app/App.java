package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class App {

	public static void main(String[] args) {
		//Escrita arquivos
		try {
			FileWriter fw;
			fw = new FileWriter("arq.txt", true); //Defino o arquivo true para manter o arquivo anexado
			fw.write("Matheus \n"); //Escrevo nele
			
			
			for (int escreva = 0; escreva < 10; escreva++) {
				fw.write(escreva + "\n");
			}
			
			fw.close(); // fecho a leitura dele
		} catch (Exception error) {
			System.out.println("Error" + error.getMessage());
		}
	//Leitura
		
		try {
			FileReader fr;
			fr = new FileReader("arq.txt");
			BufferedReader bf = new BufferedReader(fr);
			String linha = bf.readLine();
			System.out.println(linha);
			while(linha != null) {
				linha = bf.readLine();
				System.out.println(linha);
			}
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
		
  }
}