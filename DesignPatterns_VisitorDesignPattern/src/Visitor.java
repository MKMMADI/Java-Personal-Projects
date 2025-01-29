
public interface Visitor {

	public void applyDiscount(SilverMemberShip SM);
	public void applyDiscount(GoldMemberShip GM);
	public void applyDiscount(DiamondMemberShip DM);

}
