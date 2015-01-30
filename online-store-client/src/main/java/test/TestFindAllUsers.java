package test;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserServicesRemote;
import domain.User;

public class TestFindAllUsers {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/online-store/UserServices!"
				+ UserServicesRemote.class.getCanonicalName();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup(jndiName);

		List<User> users = new ArrayList<>();
		User user = proxy.findUserById(1);
		users.add(user);
		System.out.println(users.size());

	}

}
