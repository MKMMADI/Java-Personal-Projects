package acsse.csc2a.EntityCommands;

import acsse.csc2a.CommandEntities.EOven;
import acsse.csc2a.Commands.AbstractCommand;

public class TurnOffOven implements AbstractCommand 
{
	EOven oven;
	public TurnOffOven() {
		// TODO Auto-generated constructor stub
		this.oven=new EOven();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.oven.turnOff();
	}
}
