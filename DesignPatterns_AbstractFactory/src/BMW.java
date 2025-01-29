
public class BMW implements Vehicle
{

	BMWDoor door = new BMWDoor();
	BMWEngine engine = new BMWEngine();
	@Override
	public Door createDoors() {
		// TODO Auto-generated method stub
		return new BMWDoor();
	}

	@Override
	public Engine insertEngine() {
		// TODO Auto-generated method stub
		return new BMWEngine();
	}

}
