
public class GoldMemberShip implements Visitable
{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.applyDiscount(this);
	}

}
