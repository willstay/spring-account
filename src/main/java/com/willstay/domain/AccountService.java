package com.willstay.domain;

import com.willstay.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void printAll() {
        for (Account account : accountDao.getAll()) {
            System.out.println(account);
        }
    }

    public void multiplyAll(Double multiplier) {
        accountDao.getAll().stream()
                .forEach(account -> {
                    Double prevVolume = account.getVolume();
                    account.setVolume(prevVolume + prevVolume / 100d * multiplier);
                });
    }

    public void multiplyOwner(Long ownerId, Double multiplier) {
        for (Account account : accountDao.getByOwner(ownerId)) {
            Double prevVolume = account.getVolume();
            account.setVolume(prevVolume + prevVolume / 100d * multiplier);
        }
    }

    public Double getTotalVolume() {
        Double totalVolume = 0.0;
        for (Account account : accountDao.getAll()) {
            totalVolume += account.getVolume();
        }
        return totalVolume;
    }

    public Double getTotalOwnerVolume(Long ownerId) {
        Double totalVolume = 0.0;
        for (Account account : accountDao.getByOwner(ownerId)) {
            totalVolume += account.getVolume();
        }
        return totalVolume;
    }
}
