package se.lexicon.erik.spring_ioc;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.lexicon.erik.spring_ioc.data.AppUserDao;
import se.lexicon.erik.spring_ioc.model.AppUser;

public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
        AppUserDao dao = context.getBean(AppUserDao.class);
        dao.addUser(new AppUser("Erik Svensson", LocalDate.now()));
        System.out.println(dao.findById(1));
        context.close();
    }
}
