
public class DeviceButton  {
	
	Command command ;

	/**
	 * @param command
	 */
	public DeviceButton(Command command) {
		this.command = command;
	}
	
	public void press()
	{
		command.execute();
	}
}
