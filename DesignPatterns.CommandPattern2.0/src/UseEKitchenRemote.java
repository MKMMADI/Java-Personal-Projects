import acsse.csc2a.CommandEntities.EOven;
import acsse.csc2a.CommandEntities.Ekettle;
import acsse.csc2a.EntityCommands.TurnOffKettle;
import acsse.csc2a.EntityCommands.TurnOffOven;
import acsse.csc2a.EntityCommands.TurnOnKettle;
import acsse.csc2a.EntityCommands.TurnOnOven;
import acsse.csc2a.EntityMasterControl.EKitchenRemote;

public class UseEKitchenRemote {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EKitchenRemote remote = new EKitchenRemote(2);
		
		EOven oven = new EOven();
		Ekettle ekettle = new Ekettle();
		
		TurnOnOven OvenOn = new TurnOnOven();
		TurnOffOven OvenOff = new TurnOffOven();
		TurnOffKettle KettleOff = new TurnOffKettle();
		TurnOnKettle kettleOn = new TurnOnKettle();
		
		remote.setCommand(0, kettleOn, KettleOff);
		remote.setCommand(1, OvenOn, OvenOff);
		
		remote.executeOnCommands(0);
		remote.executeOffCommands(0);
		remote.executeOnCommands(1);
		remote.executeOffCommands(1);
		
	}

}
