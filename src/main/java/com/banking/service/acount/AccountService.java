package com.banking.service.acount;
import java.util.UUID;
import com.banking.model.Account;
import com.banking.model.AccountType;
import com.banking.model.Client;
import com.banking.repository.AccountRepository;

public class AccountService {
    private final AccountRepository accountRepository;
    public AccountService(){
        this.accountRepository = AccountRepository.getInstance();
    }
    public Boolean createAccount(UUID accountNumber, AccountType accountType, UUID clientId){
        Account account = new Account(accountNumber, accountType, clientId);
        return accountRepository.add(account);
    }

    public boolean removeAccount(Account account){
       return accountRepository.remove(account);
    }



}