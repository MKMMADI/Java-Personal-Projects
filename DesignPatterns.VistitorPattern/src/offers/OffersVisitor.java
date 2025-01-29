package offers;
import creditCards.*;

public interface OffersVisitor {

	public void visitSilverCreditCard(SilverCreditCard siiver);
	public void visitGoldCreditCard(GoldCreditCard gold);
	public void visitBronzeCreditCard(BronzeCreditCard bronze);
}
