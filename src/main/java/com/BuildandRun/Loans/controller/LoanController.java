package com.BuildandRun.Loans.controller;


import com.BuildandRun.Loans.controller.dto.CustomerLoanRequest;
import com.BuildandRun.Loans.controller.dto.CustomerLoanResponse;
import com.BuildandRun.Loans.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest loanRequest){

        var loanResponse = loanService.checkLoanAvaliability(loanRequest);

        return  ResponseEntity.ok(loanResponse);
    }
}
