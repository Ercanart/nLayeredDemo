package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
//�simlendirmede service varsa, i� s�n�f�n�n interfacesidir.