package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserServicesRemote;
import domain.User;

public class TestUpdateUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/online-store/UserServices!"
				+ UserServicesRemote.class.getCanonicalName();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup(jndiName);

		User userUpdated = proxy.findUserById(1);
		userUpdated.setName("new look");

		System.out.println(proxy.updateUser(userUpdated));

	}

}
