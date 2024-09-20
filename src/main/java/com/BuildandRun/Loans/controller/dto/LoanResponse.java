package com.BuildandRun.Loans.controller.dto;

import com.BuildandRun.Loans.domain.LoanType;

public record LoanResponse(LoanType loanType, Double interestRate) {
}
