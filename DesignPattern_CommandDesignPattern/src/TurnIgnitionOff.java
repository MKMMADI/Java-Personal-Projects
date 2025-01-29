
public class TurnIgnitionOff implements AbstractCommand{

	Ignition ig = new Ignition();

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ig.Off();
	}
	
	
}
