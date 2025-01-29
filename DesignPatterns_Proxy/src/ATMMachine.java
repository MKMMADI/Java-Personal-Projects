

public class ATMMachine implements GetATMData{


	public ATMMachine getYesCardState() { return hasCard; }
	public ATMMachine getNoCardState() { return noCard; }
	public ATMMachine getHasPin() { return hasCorrectPin; }
	public ATMMachine getNoCashState() { return atmOutOfMoney; }

	// NEW STUFF

	public ATMMachine getATMState() { return atmState; }
	public int getCashInMachine() { return cashInMachine; }
}
