package com.lemsviat.springboot.homework25.dao;

import com.lemsviat.springboot.homework25.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
