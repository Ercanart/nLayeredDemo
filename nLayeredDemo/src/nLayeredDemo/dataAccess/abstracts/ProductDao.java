package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id); //Bana bir id ver ve ürünü getir.
	List<Product> getAll(); //Arraylar yerine bu yapýlarý kullanýyoruz.(List)
}

