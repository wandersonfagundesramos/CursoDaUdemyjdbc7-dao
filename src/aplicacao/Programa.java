package aplicacao;

import java.util.List;

import modelo.dao.DaoFactory;
import modelo.dao.SellerDao;
import modelo.entidades.Department;
import modelo.entidades.Seller;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Programa em Java que acessa os dados do banco de dados MySQL.");
		
		System.out.println();
		
		System.out.println("=== TEST 1 : Seller findById ===");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2 : Seller findByDepartment ===");
		
		Department department = new Department(2, null);
		
		List<Seller> lista = sellerDao.findByDepartment(department);
		
		for (Seller obj : lista) {
			System.out.println(obj);
		}
	}
}