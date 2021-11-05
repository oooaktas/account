package com.milkapp.account.repository;

import com.milkapp.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String>{
}
