
public class proxyAccount implements AbstractAccount 
{

	private realSubject Subject;
	private String userName;
	private String password;
	
	/**
	 * @param balance
	 * @param userName
	 * @param password
	 */
	public proxyAccount(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void displayBalance() {
		
		if(authenticatePassword(this.password))
		{
			if(this.Subject==null)
			{
				this.Subject=new realSubject( userName, password);
			}
				
			this.Subject.displayBalance();
			
		}
		// TODO Auto-generated method stub
	}

	private boolean authenticatePassword(String password2) 
	{
		
		if(this.password=="User1")
		{
			return true;
		}
		else {
			return false;
		}
	}

}
