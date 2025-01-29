
public class RealVault implements AbstractOpenVault {

	
	private String password;
	private String privateMessage="Hello World";
	
	
	
	/**
	 * @param password
	 */
	public RealVault(String password) {
		this.password = password;
	}



	@Override
	public void OpenVault() {
		// TODO Auto-generated method stub
		System.out.println(this.privateMessage);
	}

}
