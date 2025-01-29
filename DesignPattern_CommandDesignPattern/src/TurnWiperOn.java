
public class TurnWiperOn implements AbstractCommand{

	Wipers wipe = new Wipers(); 
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wipe.On();
	}
}
