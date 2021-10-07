package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		String caminho = "c:\\temp\\in.txt";

		// Class padrão ler string de dados
		FileReader lerArquivo = null;

		// Gerencia a memoria usada para leitura
		BufferedReader genArquivo = null;

		try {
			lerArquivo = new FileReader(caminho);
			genArquivo = new BufferedReader(lerArquivo);

			String linha = genArquivo.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = genArquivo.readLine();
			}
		} catch (IOException execao) {
			System.out.println("Error: " + execao.getLocalizedMessage());

		} finally { // Erro pode dar uma exception
			try {
				lerArquivo.close();
				genArquivo.close();
			} catch (IOException execao) {
				execao.printStackTrace();
			}

		}

	}

}
