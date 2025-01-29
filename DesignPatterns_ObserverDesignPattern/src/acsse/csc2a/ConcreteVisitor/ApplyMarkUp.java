package acsse.csc2a.ConcreteVisitor;

import acsse.csc2a.Interfaces.Visitor;
import acsse.csc2a.Store.Checkers;
import acsse.csc2a.Store.PickNPay;
import acsse.csc2a.Store.ShopRite;
import acsse.csc2a.Store.Spar;
import acsse.csc2a.Store.Woolies;

public class ApplyMarkUp implements Visitor {

	@Override
	public void applyMarkUp(PickNPay Store) {
		// TODO Auto-generated method stub
		System.out.println("Price of bread at PickNPay : "+Store.getStockPrices().getBread()*150/100);
		System.out.println("Price of salt at PickNPay : "+Store.getStockPrices().getSalt()*110/100);
		System.out.println("Price of tea at PickNPay : "+Store.getStockPrices().getTea()*120/100);
		System.out.println();

	}

	@Override
	public void applyMarkUp(Spar Store) {
		// TODO Auto-generated method stub
		System.err.println("Price of bread at Spar : "+Store.getStockPrices().getBread()*159/100);
		System.err.println("Price of salt at Spat : "+Store.getStockPrices().getSalt()*119/100);
		System.err.println("Price of tea at Spar : "+Store.getStockPrices().getTea()*129/100);
	}

	@Override
	public void applyMarkUp(ShopRite Store) {
		// TODO Auto-generated method stub
		
		System.out.println("Price of bread at ShopRite : "+Store.getStockPrices().getBread()*155/100);
		System.out.println("Price of salt at ShopRite : "+Store.getStockPrices().getSalt()*115/100);
		System.out.println("Price of tea at ShopRite : "+Store.getStockPrices().getTea()*127/100);
		
	}

	@Override
	public void applyMarkUp(Checkers Store) {
		// TODO Auto-generated method stub
		
		System.out.println("Price of bread at Checkers : "+Store.getStockPrices().getBread()*120/100);
		System.out.println("Price of salt at Checkers : "+Store.getStockPrices().getSalt()*150/100);
		System.out.println("Price of tea at Checkers : "+Store.getStockPrices().getTea()*130/100);
		
	}

	@Override
	public void applyMarkUp(Woolies Store) {
		// TODO Auto-generated method stub
		System.out.println("Price of bread at Woolies : "+Store.getStockPrices().getBread()*190/100);
		System.out.println("Price of salt at Woolies : "+Store.getStockPrices().getSalt()*110/100);
		System.out.println("Price of tea at Woolies : "+Store.getStockPrices().getTea()*120/100);
	}

}
