package acsse.csc2a.Concretes;

import acsse.csc2a.interfaces.AbsConsole;
import acsse.csc2a.interfaces.AbsController;
import acsse.csc2a.interfaces.AbstractFactory;

public class PlayStation implements AbstractFactory
{

	@Override
	public AbsConsole createConsole() {
		// TODO Auto-generated method stub
		return new PlayStationConsole();
	}

	@Override
	public AbsController createControllers() {
		// TODO Auto-generated method stub
		return new PlayStationController();
	}

	
	
	

}
