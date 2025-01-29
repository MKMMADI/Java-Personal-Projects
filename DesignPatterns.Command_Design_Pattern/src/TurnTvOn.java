
public class TurnTvOn implements Command
{
	ElectronicDevice remote;
	
	public TurnTvOn(ElectronicDevice remote)
	{
		this.remote=remote;
	}
	
	@Override
	public void execute()
	{
		this.remote.on();
	}
}
