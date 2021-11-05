package com.milkapp.account.dto;

import com.milkapp.account.model.Account;

public class AccountDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    public AccountDto convert(Account from)
    {
        return new AccountDto(from.getId(),
                from.getBalance(),
                from.getCreationDate());
    }
}
