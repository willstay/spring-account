package com.willstay;

import com.willstay.config.Config;
import com.willstay.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.printAll();
        System.out.println(accountService.getTotalVolume());
        System.out.println(accountService.getTotalOwnerVolume(200L));
        accountService.multiplyAll(5d);
        accountService.multiplyOwner(200L, 10d);
        accountService.printAll();
    }
}
