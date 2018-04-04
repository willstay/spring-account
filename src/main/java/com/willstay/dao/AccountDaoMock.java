package com.willstay.dao;

import com.willstay.domain.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDaoMock {
    private final List<Account> accounts;

    public AccountDaoMock() {
        this.accounts = new ArrayList<>();
        accounts.add(new Account(0L, "Pasha", 100L, 1.5));
        accounts.add(new Account(1L, "Sasha", 200L, 2.5));
        accounts.add(new Account(2L, "Masha", 200L, 3.5));
        accounts.add(new Account(3L, "Misha", 300L, 3.0));
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
