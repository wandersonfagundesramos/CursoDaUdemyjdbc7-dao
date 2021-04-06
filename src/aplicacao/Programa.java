package aplicacao;

import java.util.Date;
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
		
		System.out.println("==========================================");
		
		System.out.println("\n=== TEST 2 : Seller findByDepartment ===");
		
		Department department = new Department(2, null);
		
		List<Seller> lista = sellerDao.findByDepartment(department);
		
		for (Seller obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("==========================================");
		
		System.out.println("\n=== TEST 3 : Seller findAll ===");
		
		lista = sellerDao.findAll();
		
		for (Seller obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("==========================================");
		
		System.out.println("\n=== TEST 4 : Seller insert ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		
		sellerDao.insert(newSeller);
		
		System.out.println("Insert! Novo id = " + newSeller.getId());
	
		System.out.println("==========================================");
	
		System.out.println("\n=== TEST 5 : Seller update ===");
		
		seller = sellerDao.findById(1);
		
		seller.setName("Marta Waine");
		
		sellerDao.update(seller);
		
        System.out.println("Update completo! ");
	}
}