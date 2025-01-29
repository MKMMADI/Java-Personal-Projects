
public class ApplyDiscounts implements Visitor
{

	@Override
	public void applyDiscount(SilverMemberShip SM) {
		// TODO Auto-generated method stub
		System.out.println("Applied 10% discount");
	}

	@Override
	public void applyDiscount(GoldMemberShip GM) {
		// TODO Auto-generated method stub
		System.out.println("Applied 19% discount");

	}

	@Override
	public void applyDiscount(DiamondMemberShip DM) {
		// TODO Auto-generated method stub
		System.out.println("Applied 30% discount");

	}

}
