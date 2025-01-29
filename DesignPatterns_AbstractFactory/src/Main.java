
public class Main 
{
	public static void main(String[] args)
	{
		Vehicle newCar ;
		
		newCar = new BMW();
		
		CarDealerShip DealerShip = new CarDealerShip(newCar);
		DealerShip.createCar();
		
	}
}
