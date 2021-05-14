package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
//Ýsimlendirmede service varsa, iþ sýnýfýnýn interfacesidir.