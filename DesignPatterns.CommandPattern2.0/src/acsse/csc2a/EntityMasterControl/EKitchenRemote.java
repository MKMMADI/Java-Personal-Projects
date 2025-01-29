package acsse.csc2a.EntityMasterControl;

import acsse.csc2a.Commands.AbstractCommand;

public class EKitchenRemote 
{
	AbstractCommand[] onCommands;
	AbstractCommand[] offCommands;
	int umberOfButtons;
	
	public EKitchenRemote(int numButtons) 
	{
		// TODO Auto-generated constructor stub
		this.onCommands=new AbstractCommand[numButtons];
		this.offCommands=new AbstractCommand[numButtons];
	}
	
	public void setCommand(int buttonNumber , AbstractCommand on , AbstractCommand off)
	{
		this.onCommands[buttonNumber]=on;
		this.offCommands[buttonNumber]=off;
	}
	
	public void executeOnCommands(int buttonNumber)
	{
		this.onCommands[buttonNumber].execute();
		
	}
	
	public void executeOffCommands(int buttonNumber)
	{
		this.offCommands[buttonNumber].execute();
		
	}
	
}
