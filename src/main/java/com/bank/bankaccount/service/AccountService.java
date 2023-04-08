package com.bank.bankaccount.service;

import com.bank.bankaccount.dto.BankAccountRequestDTO;
import com.bank.bankaccount.dto.BankAccountResponseDTO;
import com.bank.bankaccount.entities.BankAccount;
import com.bank.bankaccount.enums.AccountType;

public interface AccountService {

    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
