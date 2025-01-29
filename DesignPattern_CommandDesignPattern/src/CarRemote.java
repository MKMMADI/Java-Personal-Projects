
public class CarRemote 
{
	private AbstractCommand[] onCommands;
	private AbstractCommand[] offCommands;
	
	
	
	/**
	 * @param wiperCommand
	 * @param ignitionCommands
	 */
	public CarRemote(int numButtons) 
	{
		this.onCommands= new AbstractCommand[numButtons];
		this.offCommands=new AbstractCommand[numButtons];
		
	}
	
	public void setCommand(int buttonNumber ,AbstractCommand onCommand,AbstractCommand offCommand)
	{
		this.onCommands[buttonNumber]=onCommand;
		this.offCommands[buttonNumber]=offCommand;
	}
	
	public void pressOnButton(int buttonNumber)
	{
		onCommands[buttonNumber].execute();
	}
	
	public void pressOffButton(int buttonNumber)
	{
		offCommands[buttonNumber].execute();
	}
	

	
	
}
