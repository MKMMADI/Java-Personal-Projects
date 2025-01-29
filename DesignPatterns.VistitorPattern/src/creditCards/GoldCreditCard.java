package creditCards;

import offers.OffersVisitor;

public class GoldCreditCard implements CreditCards{

	@Override
	public void printCardName() {
		System.out.println("This is a Gold Credit Card");
	}

	@Override
	public void accept(OffersVisitor Ov) {
		Ov.visitGoldCreditCard(this);
	}



}
