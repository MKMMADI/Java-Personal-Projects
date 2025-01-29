
public class CarDealerShip 
{
	private Door door ; 
	private Engine engine;
	
	public CarDealerShip(Vehicle v) 
	{
		this.door= v.createDoors(); 
		this.engine=v.insertEngine();
	}
	
	public void createCar()
	{
		this.door.createDoors();
		this.engine.insertEngine();
		System.out.println("Car has been created");
	}

}
