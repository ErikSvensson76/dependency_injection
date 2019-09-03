package se.lexicon.erik.spring_ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import se.lexicon.erik.spring_ioc.data.AppUserDao;
import se.lexicon.erik.spring_ioc.data.AppUserDaoListImpl;

@Configuration
public class AppUserDaoConfig {
	
	@Bean
	public AppUserDao appUserDao() {
		return new AppUserDaoListImpl();
	}

}
