package acsse.csc2a.Concretes;

import acsse.csc2a.interfaces.AbsConsole;
import acsse.csc2a.interfaces.AbsController;

public class Client 
{
	public static void main(String[] args)
	{
		AbsConsole console = new PlayStationConsole();
		AbsController controllers =new PlayStationController();
		
		GamingGalaxy Store = new GamingGalaxy(console, controllers);
		Store.CreateConsoleWithController();
	}
}
