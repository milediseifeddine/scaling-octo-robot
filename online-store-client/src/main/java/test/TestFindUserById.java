package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserServicesRemote;
import domain.User;

public class TestFindUserById {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/online-store/UserServices!"
				+ UserServicesRemote.class.getCanonicalName();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup(jndiName);

		User user = proxy.findUserById(1);

		System.out.println(user.getName());

	}

}
