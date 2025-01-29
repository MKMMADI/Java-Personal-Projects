
public class TurnIgnitionOn implements AbstractCommand{

	Ignition ig = new Ignition();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ig.On();
	}

}
