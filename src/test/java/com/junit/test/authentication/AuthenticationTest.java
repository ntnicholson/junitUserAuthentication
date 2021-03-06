package com.junit.test.authentication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.junit.authentication.UserAuthentication;
import com.junit.entity.User;


public class AuthenticationTest {

	@BeforeEach
	void setUp() throws Exception {
		UserAuthentication.userDatabase.add(new User("Nicholas", "password"));
		UserAuthentication.userDatabase.add(new User("Mia", "flowers1"));
		UserAuthentication.userDatabase.add(new User("Joey", "flight"));
	}

	@Test
	public void testLogin() {
		UserAuthentication authentication = new UserAuthentication();
		assertEquals(true, authentication.validateLogin("Nicholas", "password"));
		
	}
	@Test
	public void testWrongLogin() {
		UserAuthentication authentication = new UserAuthentication();
		assertEquals(false, authentication.validateLogin("Mia", "flowers"));
	}

}
