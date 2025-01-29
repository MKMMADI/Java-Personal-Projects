
public class Television implements ElectronicDevice 
{

	private int volume = 0;

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV off");

	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		this.setVolume(this.getVolume() + 1);
	}

	@Override
	public void VolDown() {
		// TODO Auto-generated method stub
		this.setVolume(this.getVolume() - 1);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	


}
