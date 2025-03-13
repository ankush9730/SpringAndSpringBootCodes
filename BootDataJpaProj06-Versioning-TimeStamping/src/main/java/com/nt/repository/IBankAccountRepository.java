package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.BankAccoount;

@Repository
public interface IBankAccountRepository extends JpaRepository<BankAccoount, Long> {

}
