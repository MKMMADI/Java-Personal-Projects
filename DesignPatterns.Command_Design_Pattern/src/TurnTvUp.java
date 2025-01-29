
public class TurnTvUp implements Command {
	ElectronicDevice remote;

	public TurnTvUp(ElectronicDevice remote)
	{
		this.remote=remote;
	}

		@Override
		public void execute()
		{
			this.remote.volUp();
		}
}
