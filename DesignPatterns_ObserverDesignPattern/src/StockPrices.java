import java.util.ArrayList;
import acsse.csc2a.Interfaces.*;

public class StockPrices implements Observable
{
	ArrayList<Observer> Observers;
	private double salt ;
	private double Tea ;
	private double bread ;
	/**
	 * @param observers
	 * @param salt
	 * @param tea
	 * @param bread
	 */
	public StockPrices() 
	{
		this.Observers = new ArrayList<>();
	}
	@Override
	public void addSub(Observer subcriber) {
		// TODO Auto-generated method stub
		this.addSub(subcriber);
	}
	@Override
	public void removeSub(Observer subcriber) {
		// TODO Auto-generated method stub
		this.removeSub(subcriber);
		
	}
	@Override
	public void notifySub() {
		// TODO Auto-generated method stub
		for(Observer o : this.Observers)
		{
			o.update();
		}
	}
	/**
	 * @return the observers
	 */
	public ArrayList<Observer> getObservers() {
		return Observers;
	}
	/**
	 * @param observers the observers to set
	 */
	public void setObservers(ArrayList<Observer> observers) {
		Observers = observers;
	}
	/**
	 * @return the salt
	 */
	public double getSalt() {
		return salt;
	}
	/**
	 * @param salt the salt to set
	 */
	public void setSalt(double salt) {
		this.salt = salt;
		this.notifySub();
	}
	/**
	 * @return the tea
	 */
	public double getTea() {
		return Tea;
	}
	/**
	 * @param tea the tea to set
	 */
	public void setTea(double tea) {
		Tea = tea;
		this.notifySub();
	}
	/**
	 * @return the bread
	 */
	public double getBread() {
		return bread;
	}
	/**
	 * @param bread the bread to set
	 */
	public void setBread(double bread) {
		this.bread = bread;
		this.notifySub();
	}

	

	
	
	
	

	
}
