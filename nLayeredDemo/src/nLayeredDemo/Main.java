package nLayeredDemo;



import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo : Spring IoC ile çözülecek?? Bizim yerimize IoC new leme yapýyor.
		
		//ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		 
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
		

		
	}	
}
//Bir projede entitiler hariç new liyorsanýz bir problem yaþarsýnýz.


//int[] sayilar = {1,2,3,4,5};
//ArrayList<Integer> sayilar2 = new ArrayList<Integer>();
//sayilar2.add(1);


//Gerçek sistemlerde interface ler ara yüz katmaný olarak kullanýlýr.
//Yani artýk ProductManager productManager = new ProductManager(new HibernateProductDao()); yerine
//ProductService productService = new ProductManager(new HibernateProductDao()); kullanýlýr.