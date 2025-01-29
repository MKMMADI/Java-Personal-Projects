package acsse.csc2a.Store;
import acsse.csc2a.Interfaces.*;

public class ShopRite implements Observer,Visitable
{
	private StockPrices StockPrices;
	
	
	/**
	 * @param stockPrices
	 */
	public ShopRite(StockPrices stockPrices) {
		this.StockPrices = stockPrices;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.StockPrices.getBread();
		this.StockPrices.getSalt();
		this.StockPrices.getTea();
	}


	/**
	 * @return the stockPrices
	 */
	public StockPrices getStockPrices() {
		return StockPrices;
	}


	/**
	 * @param stockPrices the stockPrices to set
	 */
	public void setStockPrices(StockPrices stockPrices) {
		StockPrices = stockPrices;
	}


	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.applyMarkUp(this);
	}
	
	

}

