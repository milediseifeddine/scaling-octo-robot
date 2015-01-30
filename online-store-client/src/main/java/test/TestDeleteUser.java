package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserServicesRemote;

public class TestDeleteUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/online-store/UserServices!"
				+ UserServicesRemote.class.getCanonicalName();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup(jndiName);

		System.out.println(proxy.deleteUser(1));

	}

}
