package filterDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id ;
	String Name;
	double Price;
	
	public Product(int ID , String name , double Price)
	{
		this.id=ID;
		this.Name=name;
		this.Price=Price;
	}
}

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> Products = new ArrayList<Product>();
		Products.add(new Product(1,"CannedFood",10.0));
		Products.add(new Product(2,"Chicken",35.0));
		Products.add(new Product(3,"Suger",11.0));
		Products.add(new Product(4,"Sweets",4.0));
		
		List<Product> filterByPrice = new ArrayList<Product>();
		
		filterByPrice = Products.stream()
						.filter(product->product.Price>10.0)
						.collect(Collectors.toList());

		System.out.println(filterByPrice);
		
		Products.stream().filter(pr->pr.Price>10.0).forEach(pr->System.out.println(pr.Price));
	}

}
