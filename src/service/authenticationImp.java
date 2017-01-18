package service;

public class authenticationImp implements authentication{

	@Override
	public boolean authentication(String username, String password) {
		return ("humi".equals(username) && "123".equals(password))? true:false;
	}
	
}
