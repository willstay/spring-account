package com.willstay;

import com.willstay.config.Config;
import com.willstay.domain.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.getBean(AccountService.class).printAll();
        System.out.println(applicationContext.getBean(AccountService.class).getTotalVolume());
        System.out.println(applicationContext.getBean(AccountService.class).getTotalOwnerVolume(200L));
        applicationContext.getBean(AccountService.class).multiplyAll(5d);
        applicationContext.getBean(AccountService.class).multiplyOwner(200L, 10d);
        applicationContext.getBean(AccountService.class).printAll();
    }
}
