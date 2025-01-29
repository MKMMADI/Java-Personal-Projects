
public class Client {
	
	public static void main(String[] args)
	{
		AbstractAccount AuthUser = new proxyAccount("Katlego", "User1");
		
		AuthUser.displayBalance();
	}

}
