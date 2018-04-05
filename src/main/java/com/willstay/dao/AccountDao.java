package com.willstay.dao;

import com.willstay.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> getAll();

    Account getById(Long id);

    List<Account> getByOwner(Long owner);
}
