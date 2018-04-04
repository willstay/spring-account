package com.willstay.dao;

import com.willstay.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {
    @Autowired
    private AccountDaoMock accountDaoMock;

    public List<Account> getAll() {
        return accountDaoMock.getAccounts();
    }

    public Account getById(Long id) {
        for (Account account : accountDaoMock.getAccounts()) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getByOwner(Long owner) {
        List<Account> accounts = new ArrayList<>();
        for (Account account : accountDaoMock.getAccounts()) {
            if (account.getOwnerId().equals(owner)) {
                accounts.add(account);
            }
        }
        return accounts;
    }
}
