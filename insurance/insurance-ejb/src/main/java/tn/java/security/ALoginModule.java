package tn.java.security;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;


public class ALoginModule implements LoginModule {


	
   
	
	
	public static final String TEST_USERNAME = "iheb" ; 
	public static final String TEST_PASSWORD = "123" ; 
	private CallbackHandler callbackHndler = null ; 
	private boolean authentificationSuccessFlag = false ; 
@Override
	public boolean abort() throws LoginException {
	System.out.println("abort with sucess...");
		return false;
	}
@Override
	public boolean commit() throws LoginException {
		return authentificationSuccessFlag ; 
	}
@Override
	public void initialize(Subject arg0, CallbackHandler callbackHandler, Map<String, ?> arg2, Map<String, ?> arg3) {
	this.callbackHndler = callbackHandler ; 

	}

	@Override
	public boolean login() throws LoginException {

		
		Callback[] callbackArray =new Callback[2];

		callbackArray[0] = new NameCallback("User Name:");
		callbackArray[1] = new PasswordCallback("Password:",false);
		
		
		try {
			callbackHndler.handle(callbackArray);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnsupportedCallbackException e) {
			e.printStackTrace();
		}
	
	String name =((NameCallback) callbackArray[0]).getName() ; 
	String password = new String (((PasswordCallback) callbackArray[1]).getPassword()) ; 
	
	if (TEST_USERNAME.equals(name) && (TEST_PASSWORD.equals(password)) )  {
		
	System.out.println("authen sucess...");
	authentificationSuccessFlag = true ; 
	} else {
		authentificationSuccessFlag = false ; 
		throw new FailedLoginException("authentification failure...");
		
	}
	
		return authentificationSuccessFlag;
	}
	

	@Override
	public boolean logout() throws LoginException {
		
		return false;
	}

}
