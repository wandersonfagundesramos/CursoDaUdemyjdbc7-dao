package aplicacao;

import java.util.Date;

import modelo.entidades.Department;
import modelo.entidades.Seller;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Programa em Java que acessa os dados do banco de dados MySQL.");
		
		System.out.println();
		
		Department obj = new Department(1, "Livros");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
	}
}