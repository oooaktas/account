package com.milkapp.account.dto;

import com.milkapp.account.model.Customer;

public class CustomerDtoConverter {

    public AccountCustomerDto converToAccountCustomer(Customer from){
        if (from == null)
            return new AccountCustomerDto("","","");
        return new AccountCustomerDto(from.getId(), from.getName(), from.getSurname());
    }
}
