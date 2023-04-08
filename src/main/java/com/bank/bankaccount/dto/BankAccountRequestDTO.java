package com.bank.bankaccount.dto;

import com.bank.bankaccount.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @NoArgsConstructor @Builder @AllArgsConstructor
public class BankAccountRequestDTO {
    private Double balance;
    private String currency;
    private AccountType type;
}
