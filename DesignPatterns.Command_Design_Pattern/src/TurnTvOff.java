
public class TurnTvOff implements Command
{
	ElectronicDevice remote;

	public TurnTvOff(ElectronicDevice remote)
	{
		this.remote=remote;
	}

		@Override
		public void execute()
		{
			this.remote.off();
		}
}	
