package se.lexicon.erik.spring_ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.erik.spring_ioc.config.AppUserDaoConfig;
import se.lexicon.erik.spring_ioc.data.AppUserDao;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(AppUserDaoConfig.class);
        
        AppUserDao dao = context.getBean(AppUserDao.class);
        context.close();
    }
}
