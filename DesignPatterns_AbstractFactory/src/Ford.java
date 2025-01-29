
public class Ford implements Vehicle
{


	@Override
	public Door createDoors() {
		// TODO Auto-generated method stub
		return new FordDoor() ;
	}

	@Override
	public Engine insertEngine() {
		// TODO Auto-generated method stub
		return new FordEngine();
	}
	
	
}
