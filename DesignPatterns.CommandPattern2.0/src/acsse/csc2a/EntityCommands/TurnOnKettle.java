package acsse.csc2a.EntityCommands;

import acsse.csc2a.CommandEntities.Ekettle;
import acsse.csc2a.Commands.AbstractCommand;

public class TurnOnKettle implements AbstractCommand 
{
	Ekettle kettle ;
	
	public TurnOnKettle() {
		// TODO Auto-generated constructor stub
		this.kettle=new Ekettle();
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.kettle.turnOn();
	}
	
	

}
