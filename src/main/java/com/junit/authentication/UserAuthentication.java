package com.junit.authentication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import com.junit.entity.User;

public class UserAuthentication {
	public static List<User> userDatabase = new ArrayList<User>();
	
	public Boolean validateLogin (String username, String password) {
		AtomicBoolean loginValid = new AtomicBoolean(false);
		
		for(User u : userDatabase) {
			if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
				loginValid.set(true);
				break;
			}
		}
		
		return loginValid.get();
	}

}
