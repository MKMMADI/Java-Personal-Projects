package client;
import creditCards.*;
import offers.*;

public class Main {

	public static void main(String[] args) {
		PetrolOffers pOffer = new PetrolOffers();
		HotelOffers hOffers = new HotelOffers();
		BronzeCreditCard bronze = new BronzeCreditCard();
		bronze.accept(pOffer);
		bronze.accept(hOffers);
		//bronze.Acceptobj(pOffer);
	}

}
