package tn.java.security;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;



public class Driver {
	public static void start()
	{	System.setProperty("java.security.auth.login.config", "jaas.config");
	LoginContext loginContext = null ; 
	try {
		 loginContext = new LoginContext("Jaas", new ACallbackHandler()) ;
	} catch (LoginException e) {
		System.out.println(e.getMessage());
		System.exit(0);
		
	} 
	while (true){
		try {
			
			
			loginContext.login();
			System.exit(0);
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

	public static  void main(String[] args) {
		
		System.setProperty("java.security.auth.login.config", "jaas.config");
		LoginContext loginContext = null ; 
		try {
			 loginContext = new LoginContext("Jaas", new ACallbackHandler()) ;
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			System.exit(0);
			
		} 
		while (true){
			try {
				
				
				loginContext.login();
				System.exit(0);
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			}
		}
	

	}
	}
 