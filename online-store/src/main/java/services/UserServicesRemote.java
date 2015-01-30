package services;

import java.util.List;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user);

	Boolean deleteUser(Integer id);

	Boolean updateUser(User userUpdated);

	User findUserById(Integer id);

	List<User> findAllUsers();

}
