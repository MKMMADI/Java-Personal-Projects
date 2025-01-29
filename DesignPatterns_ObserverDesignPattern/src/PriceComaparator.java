import acsse.csc2a.ConcreteVisitor.ApplyMarkUp;
import acsse.csc2a.Interfaces.StockPrices;
import acsse.csc2a.Store.PickNPay;
import acsse.csc2a.Store.ShopRite;
import acsse.csc2a.Store.Spar;
import acsse.csc2a.Store.Woolies;

public class PriceComaparator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StockPrices Prices = new StockPrices();
		ApplyMarkUp Markup = new ApplyMarkUp();
		
		Prices.setBread(10.00);
		Prices.setTea(10.45);
		Prices.setSalt(5.75);

		Spar Store1 = new Spar(Prices);
		Store1.accept(Markup);
		PickNPay Store2 = new PickNPay(Prices);
		Store2.accept(Markup);
		ShopRite Store3 = new ShopRite(Prices);
		Store3.accept(Markup);
		Woolies Store4 = new Woolies(Prices);
		Store4.accept(Markup);

		
		
		
	}

}
