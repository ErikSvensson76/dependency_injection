package se.lexicon.erik.spring_ioc.data;

import java.util.Optional;

import se.lexicon.erik.spring_ioc.model.AppUser;

public interface AppUserDao {

	Optional<AppUser> findById(int userId);

	boolean addUser(AppUser user);

}