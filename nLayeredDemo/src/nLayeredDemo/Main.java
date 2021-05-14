package nLayeredDemo;



import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo : Spring IoC ile ��z�lecek?? Bizim yerimize IoC new leme yap�yor.
		
		//ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		 
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
		

		
	}	
}
//Bir projede entitiler hari� new liyorsan�z bir problem ya�ars�n�z.


//int[] sayilar = {1,2,3,4,5};
//ArrayList<Integer> sayilar2 = new ArrayList<Integer>();
//sayilar2.add(1);


//Ger�ek sistemlerde interface ler ara y�z katman� olarak kullan�l�r.
//Yani art�k ProductManager productManager = new ProductManager(new HibernateProductDao()); yerine
//ProductService productService = new ProductManager(new HibernateProductDao()); kullan�l�r.