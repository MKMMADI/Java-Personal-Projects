
public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		AbstractOpenVault open = new ProxyVault("12345678910");
		
		open.OpenVault();

	}

}
