package tn.java.security;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class ACallbackHandler implements CallbackHandler {
	private String pass ; 
	private String mail ; 

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public void handle(Callback[] callbackArray) throws IOException, 
		UnsupportedCallbackException {
		NameCallback nameCallback = null ; 
		PasswordCallback passwordCallback = null ; 
		int counter = 0 ; 
		while (counter <callbackArray.length) {
			if (callbackArray[counter] instanceof NameCallback) { 
				nameCallback = (NameCallback) callbackArray[counter++]; 
				System.out.println(nameCallback.getPrompt());
				nameCallback.setName((new BufferedReader(new InputStreamReader(System.in))).readLine());
				//nameCallback.setName(getMail());
			} else if (callbackArray[counter] instanceof PasswordCallback) {
				
				passwordCallback = (PasswordCallback) callbackArray[counter++]; 
				System.out.println(passwordCallback.getPrompt());
			passwordCallback.setPassword((new BufferedReader(new InputStreamReader(System.in))).readLine().toCharArray());
				//passwordCallback.setPassword(getPass().toCharArray());
			}
			
		}
		
	
		

	}

}
