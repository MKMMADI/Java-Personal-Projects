package creditCards;

import offers.*;

public class SilverCreditCard implements CreditCards {

	@Override
	public void printCardName() {

		System.out.println("This is a Silver Credit Card");
	}

	@Override
	public void accept(OffersVisitor Ov) {
		Ov.visitSilverCreditCard(this);
	}

	

}
