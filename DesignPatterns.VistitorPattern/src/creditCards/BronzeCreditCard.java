package creditCards;

import java.util.function.Consumer;

import offers.*;

public class BronzeCreditCard implements CreditCards  {

	@Override
	public void printCardName() {
		System.out.println("This is a Bronze Credi Card");
	}

	@Override
	public void accept(OffersVisitor Ov) {
		Ov.visitBronzeCreditCard(this);
	}

	public Consumer<OffersVisitor> Acceptobj = Ov->Ov.visitBronzeCreditCard(this);
	

}
