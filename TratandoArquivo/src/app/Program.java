package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Leitura simples
		File file = new File("c:\\temp\\in.txt") ;
		Scanner arquivo = null;
		try {
		 arquivo = new Scanner(file);
		 while(arquivo.hasNextLine()) {
		
			 System.out.println(arquivo.nextLine());
		 }
	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(arquivo != null) {
			arquivo.close();
			}
		}
		
		
	}
}
