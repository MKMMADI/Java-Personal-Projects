import acsse.csc2a.adaptee.IAdaptee1;
import acsse.csc2a.adapter.ConcreteAdapter;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ConcreteAdapter Adapts = new ConcreteAdapter(new IAdaptee1());
		ConcreteAdapter Adapts2 = new ConcreteAdapter(new IAdaptee2());

		Adapts.print();
		Adapts2.print();
	}

}
