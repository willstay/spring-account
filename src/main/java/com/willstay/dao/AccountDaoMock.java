package com.willstay.dao;

import com.willstay.domain.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class AccountDaoMock implements AccountDao {
    private final List<Account> accounts;

    public List<Account> getAll() {
        return accounts;
    }

    public Account getById(Long id) {
        for (Account account : accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getByOwner(Long owner) {
        return accounts.stream()
                .filter(account -> Objects.equals(account.getOwnerId(),owner))
                .collect(Collectors.toList());
    }

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
