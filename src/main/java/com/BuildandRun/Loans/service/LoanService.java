package com.BuildandRun.Loans.service;

import com.BuildandRun.Loans.controller.dto.CustomerLoanRequest;
import com.BuildandRun.Loans.controller.dto.CustomerLoanResponse;
import com.BuildandRun.Loans.controller.dto.LoanResponse;
import com.BuildandRun.Loans.domain.Loan;
import com.BuildandRun.Loans.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvaliability(@org.jetbrains.annotations.NotNull CustomerLoanRequest loanRequest){

        var customer = loanRequest.toCustomer();
        var loan = new Loan(customer);
        List<LoanResponse> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }
        if(loan.isConsigmentLoanAvailable()){
            loans.add(new LoanResponse(LoanType.CONSIGMENT, loan.getConsigmentLoanInterestRate()));
        }

        if(loan.isGuaranteedLoanAvailable()){
            loans.add(new LoanResponse(LoanType.GARANTED, loan.getGuaranteedLoanInterestRate()));
        }

        return  new CustomerLoanResponse(loanRequest.name(), loans);
    }


}
