
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRemote remote = new CarRemote(2);
		
		Ignition ig = new Ignition();
		Wipers wipe = new Wipers();
		
		
		
		AbstractCommand ignitionOn = new TurnIgnitionOn();
		AbstractCommand ignitionOff = new TurnIgnitionOff();
		AbstractCommand WipperOn = new TurnWiperOn();
		AbstractCommand WiperOff = new TurnIgnitionOff();
		
		remote.setCommand(0, WipperOn, WiperOff);
		remote.setCommand(1, WipperOn, WiperOff);
		
		remote.pressOnButton(0);
		remote.pressOffButton(0);

		
		
	}

}
