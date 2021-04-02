package aplicacao;

import modelo.dao.DaoFactory;
import modelo.dao.SellerDao;
import modelo.entidades.Seller;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Programa em Java que acessa os dados do banco de dados MySQL.");
		
		System.out.println();
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}