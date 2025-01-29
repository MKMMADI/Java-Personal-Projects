
public class realSubject implements AbstractAccount 
{
	private int balance=100 ;
	private String userName;
	private String password;
	
	
	
	
	/**
	 * @param balance
	 * @param userName
	 * @param password
	 */
	public realSubject(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		System.out.println(this.balance);
	}

}
