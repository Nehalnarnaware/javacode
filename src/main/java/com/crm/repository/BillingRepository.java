package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entites.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
