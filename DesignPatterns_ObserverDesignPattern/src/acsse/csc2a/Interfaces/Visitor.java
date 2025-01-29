package acsse.csc2a.Interfaces;
import acsse.csc2a.Store.*;

public interface Visitor 
{
	public void applyMarkUp(PickNPay Store);
	public void applyMarkUp(Spar Store);
	public void applyMarkUp(ShopRite Store);
	public void applyMarkUp(Checkers Store);
	public void applyMarkUp(Woolies Store);
	
}
