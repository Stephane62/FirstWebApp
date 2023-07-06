package com.tchonlafi.myfirstwebwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthentificationService {
	
    public boolean authentificate(String username, String password) {
    	
    	boolean isUsername = username.equalsIgnoreCase("Stephane");
    	boolean isPassword = password.equalsIgnoreCase("dummy");
		return isPassword && isUsername;
    	
    }

}
