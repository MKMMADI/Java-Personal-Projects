package acsse.csc2a.EntityCommands;

import acsse.csc2a.CommandEntities.EOven;
import acsse.csc2a.Commands.AbstractCommand;

public class TurnOnOven implements AbstractCommand{

	EOven oven;
	public TurnOnOven() {
		// TODO Auto-generated constructor stub
		this.oven=new EOven();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.oven.turnOn();
	}

}
