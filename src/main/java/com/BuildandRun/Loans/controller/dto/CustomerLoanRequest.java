package com.BuildandRun.Loans.controller.dto;

import com.BuildandRun.Loans.domain.Customer;

public record CustomerLoanRequest(Integer age,
                                  String cpf,
                                  String name,
                                  Double income,
                                  String location) {


    public Customer toCustomer(){
        return new Customer(
               age,
                cpf,
                name,
                income,
                location
        );
    }

}
