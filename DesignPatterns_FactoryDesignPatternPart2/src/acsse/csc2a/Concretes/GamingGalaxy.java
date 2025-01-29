package acsse.csc2a.Concretes;

import acsse.csc2a.interfaces.AbsConsole;
import acsse.csc2a.interfaces.AbsController;

public class GamingGalaxy 
{
	private AbsConsole console;
	private AbsController controller;
	
	public GamingGalaxy(AbsConsole console , AbsController controller) 
	{
		// TODO Auto-generated constructor stub
		
		this.console=console;
		this.controller=controller;
	}
	
	public void CreateConsoleWithController()
	{
		this.console.createConsole();
		this.controller.createController();
	}
}
