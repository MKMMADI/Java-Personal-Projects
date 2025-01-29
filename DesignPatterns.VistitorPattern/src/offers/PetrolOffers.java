package offers;

import creditCards.BronzeCreditCard;
import creditCards.GoldCreditCard;
import creditCards.SilverCreditCard;

public class PetrolOffers implements OffersVisitor {

	@Override
	public void visitSilverCreditCard(SilverCreditCard siiver) {
		System.out.println("Computing Silver Credit Card Petrol Offer");
	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard gold) {
		System.out.println("Computing Gold Credit Card Petrol Offer" );
	}

	@Override
	public void visitBronzeCreditCard(BronzeCreditCard bronze) {
		System.out.println("Computing Bronze Credit Card Petrol Offer");
	}

}
