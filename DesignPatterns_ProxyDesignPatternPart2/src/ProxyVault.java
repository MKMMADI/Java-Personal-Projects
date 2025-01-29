
public class ProxyVault implements AbstractOpenVault {

	private RealVault vault;
	private String passKey;
	
	public ProxyVault(String passkey)
	{
		this.passKey=passkey;
	}

	@Override
	public void OpenVault() 
	{
		// TODO Auto-generated method stub
		if(authenticatepassKey(this.passKey))
		{
			if(this.vault==null)
			{
				this.vault = new RealVault(passKey);
			}
		}
		this.vault.OpenVault();
	}

	private boolean authenticatepassKey(String passKey2) {
		if(passKey2=="12345678910")
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	
}
