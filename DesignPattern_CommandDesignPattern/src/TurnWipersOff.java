
public class TurnWipersOff implements AbstractCommand
{
	Wipers wipe = new Wipers(); 
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		wipe.Off();
	}

}
