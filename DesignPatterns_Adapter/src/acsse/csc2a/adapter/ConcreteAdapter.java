package acsse.csc2a.adapter;

import acsse.csc2a.adaptee.PrintUsingSpecificColour;

public class ConcreteAdapter implements IAdpter {

	PrintUsingSpecificColour adaptee ;
	
	public ConcreteAdapter(PrintUsingSpecificColour toBeUsed)
	{
		this.adaptee=toBeUsed;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		this.adaptee.printSpecific();
	}
	
}
