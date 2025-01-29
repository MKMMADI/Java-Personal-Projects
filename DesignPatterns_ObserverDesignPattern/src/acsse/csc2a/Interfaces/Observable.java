package acsse.csc2a.Interfaces;

public interface Observable 
{
	public void addSub(Observer subcriber);
	public void removeSub(Observer subcriber);
	public void notifySub();
}
