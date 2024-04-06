package com.example.Cinesoft.Repositories;

import com.example.Cinesoft.Entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository <Account,String> {
//    Account findByLogin(String login);
    Account findByRole(int role);
    boolean existsByRole(int role);
}
