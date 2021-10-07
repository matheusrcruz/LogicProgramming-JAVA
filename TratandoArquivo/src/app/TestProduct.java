package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class TestProduct {

	public static void main(String[] args) {
		
		String caminho = "c:\\temp\\in.txt";
		
		List<Product> list = new ArrayList<>();
		
		
	  try (BufferedReader genArquivo = new BufferedReader(new FileReader(caminho))) {
			String linha = genArquivo.readLine();	
			linha = genArquivo.readLine();
			
			while (linha != null) {
				
				String[] vetor = linha.split(",");
				String name = vetor[0];
				Double price = Double.parseDouble(vetor[1]); 
				Integer quantity = Integer.parseInt(vetor[2]);
				
				Product prod = new Product(name, price, quantity);
				list.add(prod);
				
			  linha = genArquivo.readLine();
			  
			}
			
			System.out.println("Produto");
			for(Product p : list) {
				System.out.println(p);
			}
		}catch (IOException execao) {
			System.out.println("Error: " + execao.getLocalizedMessage());
		}
	
	}

}
